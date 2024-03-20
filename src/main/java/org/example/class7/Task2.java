package org.example.class7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array: “Saturday is Java coding day”.
         */

        // fist way
        String [] words=new String[5];
        words[0]="Java";
        words[4]="Saturday";
        words[1]="day";
        words[2]="coding";
        words[3]="is";

        System.out.println(words[4]+" "+words[3]+" "+words[0]+" "+words[2]+" "+words[1]);


    }
}
