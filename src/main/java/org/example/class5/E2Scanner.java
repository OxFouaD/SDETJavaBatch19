package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter  byte number");
        byte smallbox=scan.nextByte();
        System.out.println("Please enter a double number");
        double bigbox=scan.nextDouble();
        System.out.println("Please enter boolean value");
        boolean logicalbox=scan.nextBoolean();

        System.out.println(smallbox);
        System.out.println(bigbox);
        System.out.println(logicalbox);

    }
}
