package com.pboreg;

public class DoWhileLoop {
    public static void main(String[] args) {

        System.out.println("ini adlaah awal program");

        int a = 0;
        boolean kondisi = true;

        do{

            a++;
            System.out.println("do while ke - " + a);
            if (a == 1) {

                kondisi = false;
            }
        } while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
