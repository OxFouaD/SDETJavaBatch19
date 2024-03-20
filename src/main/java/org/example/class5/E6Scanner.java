package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("Please enter your fullname");
        // extra call to nextLine to clear the buffer memory --
        scan.nextLine();
        String fullname=scan.nextLine();
        System.out.println("Your name is "+fullname+" you are "+age+" years old");
    }
}
