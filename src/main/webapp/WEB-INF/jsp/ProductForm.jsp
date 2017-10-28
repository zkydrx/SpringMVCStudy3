<%--
  Created by IntelliJ IDEA.
  User: Abbot
  Date: 2017-10-28
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">@import url(../../css/main.css);</style>
</head>
<body>
<div id="global">
    <fieldset>
        <form action="/product_save" method="post">
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name:</label>
                <input type="text" id="name" name="name" value="" tabindex="1"/>
            </p>

            <p>
                <label for="description">Description:</label>
                <input type="text" id="description" name="description" value="" tabindex="2"/>
            </p>

            <p>
                <label for="price">Price:</label>
                <input type="text" id="price" name="price" value="" tabindex="3"/>
            </p>

            <p id="buttons">
                <input type="reset" id="reset" tabindex="4"/>
                <input type="submit" id="submit" tabindex="5" value="Add Product"/>
            </p>
        </form>
    </fieldset>
</div>

</body>
</html>
