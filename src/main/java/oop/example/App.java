package oop.example;

import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int principle;
        double rate;
        double percentage;
        int years;
        int compound;
        double total;

        System.out.printf("What is the principal amount? ");
        principle = Integer.parseInt(input.nextLine());

        System.out.printf("What is the rate? ");
        rate = Double.parseDouble(input.nextLine());

        System.out.printf("What is the number of years? ");
        years = Integer.parseInt(input.nextLine());

        System.out.printf("What is the number of times the interest is compounded per year? ");
        compound = Integer.parseInt(input.nextLine());

        percentage = rate / 100.00;



        total = principle *  (Math.pow(1+(percentage/compound), compound * years));
        total = Math.round(total * 100.0) / 100.0;



        System.out.printf("$%d invested at %.2f%% for %d years compounded %d times per year is $%.2f\n", principle, rate, years, compound, total);





    }
}
