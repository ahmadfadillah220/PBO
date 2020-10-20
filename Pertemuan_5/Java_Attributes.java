package com.pboreg;

public class Java_Attributes {
    int x = 5;


    //Contoh Single dan Multiple
    public static void main(String[] args) {
        Java_Classes_Object myObj1 = new Java_Classes_Object();
        Java_Classes_Object myObj2 = new Java_Classes_Object();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }


}
