/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package Compound_Interest;
import java.util.Scanner;
import java.lang.Math;


public class App
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        String principle;
        String interestRate;
        String NumYears;



        System.out.print("What is the principal amount? " );
        principle = myObj.nextLine();

        System.out.print( "What is the rate? " );
        interestRate = myObj.nextLine();

        System.out.print( "What is the number of years? " );
        NumYears = myObj.nextLine();

        System.out.print( "What is the number of times the interest is compounded per year? " );
        String n = myObj.nextLine();

        Double newPrinciple = Double.parseDouble(principle);
        Double newInterestRate = Double.parseDouble(interestRate);
        Double newNumYears = Double.parseDouble(NumYears);
        Double new_n = Double.parseDouble(n);

        //Calculations

        Double interestRate2 = newInterestRate/100;
        Double math1 = interestRate2/new_n;
        Double math2 = 1 + math1;
        Double exponent = new_n * newNumYears;
        Double math3 = Math.pow(math2, exponent);
        Double finalMath = newPrinciple * math3;


        String print = String.format("$%.2f.", finalMath);
        System.out.println(principle + " invested at " +interestRate+ "%,for "+ NumYears +" years compounded " + n
        +" times per year is $"+print);

    }
}