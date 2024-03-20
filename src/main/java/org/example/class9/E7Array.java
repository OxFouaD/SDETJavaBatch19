package org.example.class9;

public class E7Array {
    public static void main(String[] args) {
        // calculate tha avg of numbers which are greater than
        // count how many even numbers are present in this array
        int [] numbers={10,25,45,66,85,100};
        int counter=0;
        for(int n:numbers){
            if(n%2==0){
                counter++;
            }
        }
        System.out.println(counter);

    }




}


