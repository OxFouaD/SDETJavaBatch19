package org.example.class7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
        Then print your name from that array.
        (use 2 different ways of creating an array).
         */

        // fist way
        String [] names=new String[12];
        names[0]="Abdullah";
        names[11]="Danil";
        names[1]="Gibril";
        names[2]="Jelena";
        names[3]="Marlene";
        names[4]="Md Shahedul";
        names[5]="Mollik";
        names[6]="Sergiy";
        names[7]="Shahriar";
        names[8]="Shpend";
        names[9]="Ubaidur";
        names[10]="Will";

        System.out.println(Arrays.toString(names));

         // second way

        String [] studentNames={"Abdullah","Danil","Gibril","Jelena","Marlene","Md Shahedul","Mollik","Sergiy","Shahriar","Shpend","Ubaidur","Will"};
        System.out.println(Arrays.toString(studentNames));
    }
}
