package org.example.class6;

/*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries
 */

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country name");
        String country=scan.nextLine();

        switch (country){
            case"USA":
                System.out.println("We speak English");
                break;
            case "Morocco":
                System.out.println("We speak Arabic");
                break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "China":
                System.out.println("We speak Chinese");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            default:
                System.out.println("Country Not Supported");
        }


    }
}
