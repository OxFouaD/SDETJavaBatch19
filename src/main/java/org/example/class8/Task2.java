package org.example.class8;

public class Task2 {
    public static void main(String[] args) {

        String [][] namesandGrades={
                {"Ali","Ana","Iram","Asghar"},
                {"A","B","C","D"},

        };
        for (int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                if(namesandGrades[i][j].equals("A")||namesandGrades[i][j].equals("B")){
                    System.out.println(namesandGrades[0][j]);
                }
            }
        }


    }


 }



