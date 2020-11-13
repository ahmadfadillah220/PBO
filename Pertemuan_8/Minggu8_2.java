package com.pboreg;
//membuat interface
interface Mamalia{
    //interface method
    public void tempatTinggal();
    public void tidur();
}
interface MakhlukHidup{
    //interface method
    public void bernafas();
    public void bernama();
}
class Hewan1 implements Mamalia, MakhlukHidup{
    @Override
    public void tempatTinggal(){
        System.out.println("Tempat tingal Air");
    }
    @Override
    public void tidur(){
        System.out.println("zzzzz");
    }
    @Override
    public void bernafas(){
        System.out.println("Paru-paru");
    }
    @Override
    public void bernama(){
        System.out.println("Ikan paus");
    }
}
public class Minggu8_2 {
    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.bernama();
        paus.bernafas();
        paus.tempatTinggal();

    }
}
