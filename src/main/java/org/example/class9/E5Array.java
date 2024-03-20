package org.example.class9;

public class E5Array {
    public static void main(String[] args) {
        // calculate tha avg of numbers using enhanced for loop

        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        for(int n:numbers){
            sum+=n;
        }
        System.out.println(sum/ numbers.length);



    }
}

