package org.example.class4;

public class Task5 {
    public static void main(String[] args) {

        double mortgageRate=5.3;
        double mortgagePrice=120000;

        if(mortgageRate>4.5){
            System.out.println("User will not buy a house");
        }else{
            if(mortgagePrice>100000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }

    }
}
