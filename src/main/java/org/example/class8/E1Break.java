package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String [] names={"James","Iram","Matt","ubaidur","Ana","Silvia"};
        // search for the name Iram if it is present print on the console name is present.
        String name = "Iram";
        for(String n:names){
            if(n.equals(name)){
                System.out.println(n+" is present");
                // we use break; to stop the loop as soon as it finds the matched value/name
                break;
            }

        }

    }
}
