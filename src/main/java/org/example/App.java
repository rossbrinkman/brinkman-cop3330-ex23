package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the first number? " );

        Scanner scanner = new Scanner(System.in);
        String first, second;
        int firstNumber, secondNumber;

        first = scanner.nextLine();
        firstNumber = Integer.parseInt(first);

        System.out.println( "What is the second number? " );
        second = scanner.nextLine();
        secondNumber = Integer.parseInt(second);

        System.out.println( firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        System.out.println( firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        System.out.println( firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
        System.out.println( firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
    }
}
