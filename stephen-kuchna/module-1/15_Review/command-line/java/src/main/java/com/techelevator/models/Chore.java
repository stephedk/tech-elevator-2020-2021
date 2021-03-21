package com.techelevator.models;

public class Chore 
{
    private String name;
    private String person;

    public Chore(String name, String person)
    {
        this.name = name;
        this.person = person;
    }

    public String getName()
    {
        return name;
    }

    public String getPerson()
    {
        return person;
    }

    @Override
    public String toString()
    {
        return name + "[" + person + "]";
    }
    
}
