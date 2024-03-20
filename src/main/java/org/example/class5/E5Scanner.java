package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        /*
        next is going to pick the first word and charAt(0) is going to pick the fist letter from that word
         */
        char gender=scan.next().charAt(0);
        // charAt katakhoud l harf lowl o hadik (0) kat7eded ashmn 7arf. ida kant 0 ya3ni lowl, kant 1 ya3ni tani ...
        System.out.println(gender);
    }
}
