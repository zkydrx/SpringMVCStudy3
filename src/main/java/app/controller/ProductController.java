package app.controller;

import app.domain.Product;
import app.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-28
 * Time: 23:54
 * Description:
 */
@Controller
public class ProductController
{
    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value="/product_input")
    public String inputProduct()
    {
        logger.info("inputProduct called.");
        return "ProductForm";
    }

    @RequestMapping(value="/product_save")
    public String saveProduct(ProductForm productForm, Model model)
    {
        logger.info("saveProduct called");
        // no need to create and instantiate a ProductForm
        // create Product
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try
        {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        // add product
        model.addAttribute("product",product);
        return "ProductDetails";
    }
}
