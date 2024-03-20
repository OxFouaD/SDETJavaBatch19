package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter enter First Number");
        double num1=scan.nextDouble();
        System.out.println("Enter Operator sign");
        char operator=scan.next().charAt(0);
        System.out.println("Enter enter Second Number");
        double num2=scan.nextDouble();
        switch (operator) {

            case '+':
                System.out.println("The result is " + (num1 + num2));
                break;

            case '-':
                System.out.println("The result is " + (num1 - num2));
                break;

            case '*':
                System.out.println("The result is " + (num1 * num2));
                break;

            case '/':
                System.out.println("The result is " + (num1 / num2));
                break;
            default:
                System.out.println("invalid input");
        }


    }
}
