package com.pboreg;

public class ContohNestedException1 {
    public static void main(String[] args) {
        try{
            try {
                try {
                    int arrBill[] = {1,2,3,4};

                    System.out.println(arrBill[10]);
                }catch (ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println("ditangani pada try-block3");
                }
            }catch (ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println("Ditangani pada try-block2");
            }
        }catch (ArithmeticException e){
            System.out.print("Arithmetic Exception");
            System.out.println("ditangani pada main try-block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("ArrayIndexOutBounds Exception ");
            System.out.println("ditangani pada main tyr-block");
        }catch (Exception e){
            System.out.println("Exception ");
            System.out.println("ditangani pada main try-block");
        }
    }
}
