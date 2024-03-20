package org.example.Class2;

public class Variables {
    public static void main(String[] args) {

        String firstname="Ali";
        String lastname="Saikouk";
        String city="Philadelphia";
        String state="PA";
        String phonenumber="2675055522";

        System.out.println("My First name is "+firstname+" "+"and my last name is"+" "+lastname);
        System.out.println("I live in city "+city+" "+"and state"+" "+state);
        System.out.println("And my phone number is "+" "+phonenumber);

        String fullname="Ali Saikouk";
        String newcity="New York";
        String newstate="NC";
        String newphonenumber="2675057811";
        System.out.println("My name is "+fullname+" "+"and i moved to new city "+newcity+" "+"and new state"+" "+newstate);
        System.out.println("And my new phone number is "+" "+newphonenumber);

        newcity="Miami";
        newstate="Florida";
        newphonenumber="+1 267 505 7811";

        System.out.println("My name is "+fullname+" "+"and i moved to new city "+newcity+" "+"and new state"+" "+newstate);
        System.out.println("And my new phone number is "+" "+newphonenumber);
    }
}
