package com.pboreg;

public class Java_Constructor {
    int modelYear;
    String modelName;

    public Java_Constructor(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Java_Constructor myCar = new Java_Constructor(1969,"Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
