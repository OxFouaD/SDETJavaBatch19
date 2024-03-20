package org.example.class7;

public class E12Arrays {
    public static void main(String[] args) {
        /*
        From any array of integer elements find the largest number.
         */

          int[] numbers={10,20,30,80,555,4588,2211,54354};
          int value=0;
          for(int i=0; i< numbers.length; i++){
              if(numbers[i] > value){
                  value=numbers[i];
              }
          }
        System.out.println(value);


          // OR we can solve it this way using the enhanced loop

        int[] numbers1={10,20,30,80,555,4588,2211,54354};
        int max=numbers1[0];
        for (int n:numbers1){
            if(max<n){
                max=n;
            }
        }
        System.out.println(max);

          }

        }




