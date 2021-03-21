package com.techelevator.crm;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CustomerTests {

    @Test
    public void getBalanceDue() {
        Customer customer = new Customer("Test", "Testerson");

        Map<String,Double> services = new HashMap<>();
        services.put("Grooming", 45.00);
        services.put("Sitting", 120.00);
        services.put("Walking", 37.50);
        double due = customer.getBalanceDue(services);

        assertEquals("The balance for services rendered is not correct.",202.50, due,0.0);
    }
}
