<%--
  Created by IntelliJ IDEA.
  User: mihirsanjaysawant
  Date: 09/04/23
  Time: 6:29 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Product Page</title>
</head>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    form>div{
        padding: 20px;
    }
    h1{
        padding: 10px;
    }
</style>
<body>
<h1>Enter Product into DB:</h1>
<form action="" method="post">
    <div>
        Enter Product Name : <input type="text" name="name"/>
    </div>

    <div>
        Enter Product Qty : <input type="number" name="qty"/>
    </div>
    <div>
        Enter Product Price : <input type="number" name="cost"/>
    </div>

    <div>
        Select Type of Product : <select name="type">
                <option value="Food and Snacks">Food and Snacks</option>
                <option value="Hot and Cold Drinks">Hot and Cold Drinks </option>
                <option value="Dairy Products">Dairy Products</option>
                <option value="Others">Others</option>
        </select>

    </div>
    <div>
        <input type="submit" value="Add Product"/>
    </div>
</form>
</body>
</html>
