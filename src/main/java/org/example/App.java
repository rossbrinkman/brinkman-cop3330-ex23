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
        DecimalFormat f = new DecimalFormat("#0.00####");
        Scanner scanner = new Scanner(System.in);
        int maleOrFemale;
        float ouncesAlcohol, weight, hoursSinceLastDrink, alcoholDistributionRatio, bloodAlcoholContent;
        String currentInput;

        System.out.println( "Enter a 1 if you are male or a 2 if you are female: " );
        currentInput = scanner.nextLine();
        try{
            maleOrFemale = Integer.parseInt(currentInput);}
        catch (NumberFormatException nfe){
            System.out.println( "Input must be numeric" );
            return;
        }

        if(maleOrFemale == 1)
            alcoholDistributionRatio = 0.73f;
        else if (maleOrFemale == 2)
            alcoholDistributionRatio = 0.66f;
        else
        {
            System.out.println( "Invalid Input" );
            return;
        }

        System.out.println( "How many ounces of alcohol did you have? " );
        ouncesAlcohol = scanner.nextFloat();

        System.out.println( "What is your weight in pounds? " );
        weight = scanner.nextFloat();

        System.out.println( "How many hours has it been since your last drink? " );
        hoursSinceLastDrink = scanner.nextFloat();

        bloodAlcoholContent = (ouncesAlcohol * 5.14f / weight * alcoholDistributionRatio) - .015f * hoursSinceLastDrink;

        System.out.println( "Your BAC is " + f.format(bloodAlcoholContent));

        String endString = bloodAlcoholContent >= .08f ? "It is not legal for you to drive" : "It is legal for you to drive";

        System.out.println(endString);

        scanner.close();
    }
}
