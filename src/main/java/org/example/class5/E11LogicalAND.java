package org.example.class5;

public class E11LogicalAND {
    public static void main(String[] args) {

        /*
        in logicalAnd, false, false,false=false / false, true,false=false / true, true,true=true
         */
        double math=95;
        double science=92;
        double history=80;

        if(math>90 && science>90 && history>90){

            System.out.println("Great work you got an A+");

        }else{
            System.out.println("You need to work hard");
        }


        }


    }
