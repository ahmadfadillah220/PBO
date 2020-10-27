package com.pboreg;

class Player3 {
    private String name;

    Player3(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }
}
