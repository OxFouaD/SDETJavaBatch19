package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter the name of your city");
        String city=scan1.nextLine();
        System.out.println("Enter the Temperature in Fahrenheit");
        double fahrenheit=scan2.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("The temperature in " + city + " is " + celsius + " degrees Celsius.");

    }
}
