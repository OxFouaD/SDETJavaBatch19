package org.example.class6;

import java.util.Scanner;

public class E10Loops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting point of the loop");
        int start=scan.nextInt();
        System.out.println("Please enter the stopping number");
        int end=scan.nextInt();
        System.out.println("Please enter the step size");
        int stepSize=scan.nextInt();

        while(start<=end){
            System.out.print(start+" ");
            start+=stepSize;

        }
    }
}
