package com.pboreg;

public class Fungsi_Method_2 {
    public static void main(String[] args) {

        System.out.println(simple());

        fungsiVoid("Apa pun");
        selamatPagi(" emak");
        selamatPagi(" Bapak");
    }
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi" + nama);
    }
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }
    private static float simple(){
        return 10.0f;
    }
}
