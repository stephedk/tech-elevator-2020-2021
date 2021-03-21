package com.techelevator.review_too;

public class Calculator 
{
    private double answer = 0;

    public double getAnswer()
    {
        return answer;
    }

    public double add(int number)
    {
        answer += number;
        return answer;
    }

    public double add(double number)
    {        
        answer += number;
        return answer;
    }

    public double add(String number)
    {        
        answer += Double.parseDouble(number);
        return answer;
    }

    public double clear()
    {
        answer = 0;
        return answer;
    }
    
}
