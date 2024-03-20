package org.example.class8;

public class E3_2DArrays {
    public static void main(String[] args) {
        /*
        10 20 40 50
        20 40 90 65
        15 50 33 30
         */

        int [][] matrix= {
            {10,20,40,50}, //0 1 2 3
            {22,40,90,65}, //1
            {15,50,33,30}  //2
        };

        System.out.println(matrix[2][3]);
        System.out.println(matrix[1][2]);
    }
}
