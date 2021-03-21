package com.techelevator.models.data;

import com.techelevator.models.products.Chip;
import com.techelevator.models.products.Product;

import java.math.BigDecimal;

public class ProductBuilder
{

    public static Product build (String name, String price, String type )
    {
        BigDecimal productPrice = new BigDecimal(price);
        return build(name, productPrice, type);
    }

    public static Product build ( String name, BigDecimal price, String type )
    {
        try
        {
            String typeName = "com.techelevator.models.products." + type;
            Class<?> cls = Class.forName(typeName);
            Product product = (Product)cls.newInstance();
            product.setName(name);
            product.setPrice(price);
            return product;
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return new Chip(name, price);

//
//        switch ( type.toLowerCase() )
//        {
//            case "gum":
//                return new Gum( name, productPrice );
//            case "candy":
//                return new Candy( name, productPrice );
//            case "drink":
//                return new Drink( name, productPrice );
//            case "chip":
//            default:
//                return new Chip( name, productPrice );
//        }
    }
}
