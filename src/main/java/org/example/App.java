package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scanner = new Scanner(System.in);
        float principal, interestRate, years, finalValue;

        System.out.println( "Enter the principal: " );
        principal = scanner.nextFloat();

        System.out.println( "Enter the rate of interest: " );
        interestRate = scanner.nextFloat();

        System.out.println( "Enter the number of years: " );
        years = scanner.nextFloat();

        interestRate /= 100;
        finalValue = principal * (1 + interestRate*years);
        interestRate *= 100;

        System.out.println( "After " + (int)years + " years at " + interestRate +
                "%, the investment will be worth $" + f.format(finalValue));
    }
}
