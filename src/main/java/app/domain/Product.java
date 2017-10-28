package app.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-25
 * Time: 10:40
 * Description:
 */
public class Product implements Serializable
{
    private static final long serialVersionUID= 748392348L;
    private String name;
    private String description;
    private float price;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }
}
