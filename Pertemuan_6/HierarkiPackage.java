package com.pboreg;



import com.terminal.Console;
import static com.terminal.Console.log;


class HierarkiPackage {
    public static void main(String[] args) {
        Player2 player1 = new Player2("Cypher");
        player1.show();

        Console.log("Menampilkan Data dengan Console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());

    }

}
