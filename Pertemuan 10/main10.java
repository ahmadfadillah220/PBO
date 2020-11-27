package com.pboreg;

public class main10 {
    public static void main(String[] args) {
        try{
            int divideByZero = 5/0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmaticException=>" + e.getMessage());
        }finally {
            System.out.println("This is the finally block");
        }
    }
}
