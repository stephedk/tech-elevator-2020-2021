package com.techelevator.models.products;

import com.techelevator.models.data.ProductBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ProductTests
{
    @Test
    public void Should_CreateProduct_OfCorrectSubType()
    {
        //arrange
        Product product1;
        Product product2;
        Product product3;
        Product product4;

        //act
        product1 = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        product2 = ProductBuilder.build( "Hubba Bubba", "0.25", "Gum" );
        product3 = ProductBuilder.build( "Skittles", "1.25", "Candy" );
        product4 = ProductBuilder.build( "Mountain Dew", "1.50", "Drink" );

        //assert
        Assert.assertTrue(product1 instanceof Chip);
        Assert.assertTrue(product2 instanceof Gum);
        Assert.assertTrue(product3 instanceof Candy);
        Assert.assertTrue(product4 instanceof Drink);
    }

    @Test
    public void Should_ReturnMessage_OfProductType()
    {
        //arrange
        Product product1 = ProductBuilder.build("Sun Chips", "1.95", "Chip" );
        Product product2 = ProductBuilder.build( "Hubba Bubba", "0.25", "Gum" );
        Product product3 = ProductBuilder.build( "Skittles", "1.25", "Candy" );
        Product product4 = ProductBuilder.build( "Mountain Dew", "1.50", "Drink" );

        //act
        String message1 = product1.consume();
        String message2 = product2.consume();
        String message3 = product3.consume();
        String message4 = product4.consume();

        //assert
        Assert.assertEquals( "Crunch Crunch, Yum!", message1 );
        Assert.assertEquals( "Chew Chew, Yum!", message2 );
        Assert.assertEquals( "Munch Munch, Yum!", message3 );
        Assert.assertEquals( "Glug Glug, Yum!", message4 );

    }
}
