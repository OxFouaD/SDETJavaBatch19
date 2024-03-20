package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is the amount of the loan needed?");
        double amount= scan.nextDouble();
        if(amount<=200000){
            System.out.println("your application is approved");
        }else{
            System.out.println("we can't give you a loan");
        }
    }
}
