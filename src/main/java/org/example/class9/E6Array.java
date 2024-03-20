package org.example.class9;

public class E6Array {
    public static void main(String[] args) {
        // calculate tha avg of numbers which are greater than
        // using enhanced for loop

        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        int counter=0;
        for(int n:numbers){
            if(n>25) {
                sum+=n;
                counter++;
            }
        }
        System.out.println(sum/counter);



    }
}

