package com.pboreg;

public class Contoh2_MethodParameter {
    static void checkAge(int age){
        if (age<18){
            System.out.println("Acces denied-you are old enough!");
        }else{
            System.out.println("Acces denied you are enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
