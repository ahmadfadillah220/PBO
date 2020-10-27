package com.pboreg;

public class OverloadingConstructorMethod {
    public static void main(String[] args) {
        Player player1 = new Player("Sasuke");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Madara");


        player1.show();
        player2.show();
        player3.show();
        player4.show();



        // overloading methods
        int a = Matematika.tambah(1,19);
        System.out.println(a);

        double b = Matematika.tambah(1, 0.98);
        System.out.println(b);

    }
}
