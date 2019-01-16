package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t \t Customer Record");

        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.println("Enter purchase amount: $ ");
        double price = Double.parseDouble(input.nextLine());



        System.out.println("Enter tax code: ");
        int taxCode = Integer.parseInt(input.nextLine());
        int tax = 0;
        double salesTax;
        double total = 0.0;
        switch (taxCode) {
            case 0 : tax = 0;
                   break;

            case 1 : tax = 3;
                   break;

            case 2 : tax = 5;
                   break;

            case 3 : tax = 7;
                   break;
                   default: System.out.println("ERROR: Invalid tax code");
        }

       //Compute tax
        tax /= 100;
        salesTax = price * tax;
        total += salesTax;

        System.out.println("Customer's  name: "+ customerName);
        System.out.println("Purchase amount: "+ price);
        System.out.println("Sales tax: "+ tax+ "%");
        System.out.println("Total amount: "+ total);

    }
}
