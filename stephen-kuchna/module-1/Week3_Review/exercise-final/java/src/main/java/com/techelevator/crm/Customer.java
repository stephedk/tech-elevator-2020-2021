package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets = new ArrayList<Pet>();

    public Customer(String firstName, String lastName) {
        this(firstName,lastName,"");
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double owes = 0.0;
        for(Map.Entry<String,Double> sr : servicesRendered.entrySet()) {
            owes += sr.getValue();
        }

        return owes;
    }
}
