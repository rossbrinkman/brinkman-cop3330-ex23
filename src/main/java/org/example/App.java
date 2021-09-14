package org.example;
import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String currentInput;

        System.out.println( "Is the car silent when you turn the key? " );
        currentInput = scanner.nextLine().toLowerCase();

        if(Objects.equals(currentInput, "y"))
        {
            System.out.println( "Are the battery terminals corroded? " );
            //scanner.next();
            currentInput = scanner.nextLine().toLowerCase();

            if(Objects.equals(currentInput, "y"))
                System.out.println( "Clean the terminals and try starting again. " );
            else
                System.out.println( "Replace cables and try again " );
        }
        else
        {
            System.out.println( "Does the car make a slicking noise? " );
            //scanner.next();
            currentInput = scanner.nextLine().toLowerCase();

            if(Objects.equals(currentInput, "y"))
                System.out.println( "Replace the battery. " );
            else {
                System.out.println("Does the car crank up but fail to start? ");
                //scanner.next();
                currentInput = scanner.nextLine().toLowerCase();

                if(Objects.equals(currentInput, "y"))
                    System.out.println( "Check spark plug connections. " );
                else
                {
                    System.out.println("Does the engine start and then die? ");
                    //scanner.next();
                    currentInput = scanner.nextLine().toLowerCase();

                    if(Objects.equals(currentInput, "y"))
                    {
                        System.out.println("Does your car have fuel injection? ");
                        //scanner.next();
                        currentInput = scanner.nextLine().toLowerCase();

                        if(Objects.equals(currentInput, "y"))
                            System.out.println("Get it in for service. ");
                        else
                            System.out.println("Check to ensure the choke is opening and closing. ");
                    }
                    else
                        System.out.println( "This should not be possible. " );
                }
            }
        }

        scanner.close();
    }
}
