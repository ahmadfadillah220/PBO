package com.pboreg;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Menghitung deret Fibonacci
        // fibonacci deret ke 0 1 2 3 4 5 6 7  8  9  10 ... n
        //          adalah  = 0 1 1 2 3 5 8 13 21 34 55 ... n
        // deret fibonacci adalah deret yang di hasilkan dari penjumlahan dua deret di belakang deret ke n
        // rumus fn = fn-1 + fn-2

//        Program Fibonacci dengan For loop
        Scanner inputan = new Scanner(System.in);
        int f_n , f_n_1, f_n_2, n;

        f_n_2 = 0;  //ini adalah deret fibonacci ke 0
        f_n_1 = 1;  //ini adalah deret fibonacci ke 1
        f_n = 1;    //ini adalah deret fibonacci ke 2

        System.out.println("==FOR Loop Fibonacci==");
        System.out.print("Nilai deret ke? ");
        n = inputan.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Deret ke "+ i +" adalah "+ f_n);
            f_n = f_n_1 + f_n_2;    // fn = fn-1 + fn-2
            f_n_2 = f_n_1;      //update nilai untuk perhitungan berikutnya
            f_n_1 = f_n;        //update nilai untuk perhitungan berikutnya
        }


//        Program Fibonacci dengan While loop
        f_n_2 = 0;  //ini adalah deret fibonacci ke 0
        f_n_1 = 1;  //ini adalah deret fibonacci ke 1
        f_n = 1;    //ini adalah deret fibonacci ke 2

        System.out.println("==WHILE Loop Fibonacci==");
        int i = 1;

        while (i <= n){
            System.out.println("Deret ke "+ i +" adalah "+ f_n);
            f_n = f_n_1 + f_n_2;    // fn = fn-1 + fn-2
            f_n_2 = f_n_1;      //update nilai untuk perhitungan berikutnya
            f_n_1 = f_n;        //update nilai untuk perhitungan berikutnya
            i++;
        }


//        Program Fibonacci dengan Do While loop
        f_n_2 = 0;  //ini adalah deret fibonacci ke 0
        f_n_1 = 1;  //ini adalah deret fibonacci ke 1
        f_n = 1;    //ini adalah deret fibonacci ke 2

        System.out.println("==DO WHILE Loop Fibonacci==");

        i = 1;

        do{
            System.out.println("Deret ke "+ i +" adalah "+ f_n);
            f_n = f_n_1 + f_n_2;    // fn = fn-1 + fn-2
            f_n_2 = f_n_1;      //update nilai untuk perhitungan berikutnya
            f_n_1 = f_n;        //update nilai untuk perhitungan berikutnya
            i++;
        } while(i <= n);
    }
}
