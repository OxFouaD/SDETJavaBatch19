package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan1.nextInt();
        System.out.println("Please enter your fullname");
        String fullname=scan2.nextLine();
        System.out.println("Your full name and age is "+fullname+" "+age);

    }
}
