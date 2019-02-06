//  Justin Lazarski
//  CIS3090.04
//  2/5/19
//  In class assigment 1

package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating the Scanner
        Scanner scnr = new Scanner(System.in);
        //Initializing the variables
        double price;
        final double salesTaxRate;
        double taxPrice;
        double totalPrice;
        salesTaxRate = 0.10;
        price = scnr.nextDouble();
        //Calculating the totalPrice
        taxPrice = price * salesTaxRate;
        totalPrice = price + taxPrice;
        //Printing the Result
        System.out.println("Total cost: " + totalPrice);
    }
}
