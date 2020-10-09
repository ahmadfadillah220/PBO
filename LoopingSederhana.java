package com.pboreg;

import java.util.Scanner;

public class LoopingSederhana {
    public static void main(String[] args) {

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.println(" masukan nilai awal=  ");
        nilaiAwal = inputUser.nextInt();
        System.out.println(" masukan nilai akhir= ");
        nilaiAkhir= inputUser.nextInt();

        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total= total + nilaiAwal;
            System.out.println("ditambah "+nilaiAwal+"menjadi "+ total);
            nilaiAwal++;
        }
    }
}
