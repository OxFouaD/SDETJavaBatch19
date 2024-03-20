package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        Boolean answer=scan.nextBoolean();
        if(answer){
            System.out.println("what is the balance on the card");
            double balance=scan.nextDouble();
            if(balance>1000){
                System.out.println("You have to Pay off immediately");
            }else{
                System.out.println("you can spend more");
            }
        }else{
            System.out.println("we can offer you a credit card");
        }
    }
}
