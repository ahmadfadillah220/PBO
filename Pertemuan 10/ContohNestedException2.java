package com.pboreg;

public class ContohNestedException2 {
    public static void main(String[] args) {
        try{//Parent try-block
            try {//Child try-block
                System.out.println("Di dalam child block 1");
                int b = 30/0;
                System.out.println(b);
                }catch (ArithmeticException e){
                    System.out.print("Arithmetic Exception ");
                    System.out.println("ditangani pada try-block1");
                }
                try {//child try-block2
                    System.out.println("Di dalam child block2");
                    int b = 40/0;
                    System.out.println(b);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println("Ditangani pada try-block2");
                }
        }catch (ArithmeticException e){
            System.out.print("Arithmetic Exception ");
            System.out.println("ditangani pada main try-block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("ArrayIndexOutBounds Exception ");
            System.out.println("ditangani pada main tyr-block");
        }catch (Exception e){
            System.out.println("Exception ");
            System.out.println("ditangani pada main try-block");
        }
        finally {
            System.out.println("Next statement..");
        }
    }
}

