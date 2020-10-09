package com.pboreg;

import java.util.Scanner;
public class SystemLogin {
    public static void main(String[] args) {
        String  id;
        String pass;
        int i=1;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Awal Program");
        System.out.println("Silahkan masukan :");

        while (i<4) {

            System.out.print("Ssername: ");
            id = inputUser.next();

            System.out.print("Password: ");
            pass = inputUser.next();


            if (id.equals("fadil") && pass.equals("fadil")){
                System.out.println("selamat datang");
                return ;
            }else{
                System.out.println("username dan password salah, ini percobaan ke-"+i);
            }
            i++;

        }
        System.out.println("percobaan sudah mencapai batas maksimal yaitu 3x");



    }
}


