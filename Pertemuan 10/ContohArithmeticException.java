package com.pboreg;
import java.util.Scanner;
class Bilangan{
    private int a;
    private int b;
    public void setA(int a){this.a =a; }
    public void setB(int b){this.b =b; }
    public void hasil(){
        int hasil=0;
        try{
            hasil = a/b;
        }catch (ArithmeticException e){
            System.out.println("Terjadi error : " + e);
        }
        System.out.println("hasil = " + hasil);
    }
}
public class ContohArithmeticException{
    public static void main(String[] args) {
        Bilangan bil = new Bilangan();
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int hasil=0;
        System.out.println("Masukan bilangan 1:");
        a = sc.nextInt();
        bil.setA(a);
        System.out.println("Masukan bilangan 2:");
        b = sc.nextInt();
        bil.setB(b);
        bil.hasil();
        System.out.println("Terima kasih");
    }
}