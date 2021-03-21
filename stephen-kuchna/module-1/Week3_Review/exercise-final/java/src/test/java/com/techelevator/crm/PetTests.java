package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

    @Test
    public void listVaccinations() {
        Pet pet = new Pet("Fido", "Dog");
        pet.getVaccinations().add("Rabies");
        pet.getVaccinations().add("Distemper");
        pet.getVaccinations().add("Parvo");

        Assert.assertEquals("List Vaccinations is not returning the vaccinations in the correct format.",
                "Rabies, Distemper, Parvo",
                pet.listVaccinations());
    }
}
