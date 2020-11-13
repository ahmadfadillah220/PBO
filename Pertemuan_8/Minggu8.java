package com.pboreg;
//class Abstract
abstract class Hewan{
    public abstract void suaraHewan();

    public void tidur(){
        System.out.println("zzz...");
    }
}
//inheritage turunan dari class abstract
class Ayam extends Hewan{
    public void suaraHewan(){
        //body dari abstract method suaraHewan
        System.out.println("Kukukuruyukkk");
    }
}
class Kucing extends Hewan{
    @Override
    public void suaraHewan(){
        System.out.println("Meong...Meong");
    }
}
public class Minggu8 {
    public static void main(String[] args) {
        Ayam ayamku = new Ayam();//membuat object ayam
        ayamku.suaraHewan();
        ayamku.tidur();
        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
