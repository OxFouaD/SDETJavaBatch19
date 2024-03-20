package org.example.class9;

public class E4Array {
    public static void main(String[] args) {

        // Write a program to calculate the avg of these numbers

        int [] numbers={10,25,45,66,85,100};
        int sum = 0;

        for (int i=0; i< numbers.length; i++) {
            sum = sum+numbers[i];
        }

        int average = sum / numbers.length;
        System.out.println("Average: " + average);

    }
}

