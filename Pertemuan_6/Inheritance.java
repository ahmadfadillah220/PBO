package com.pboreg;

// inheritance adalah hubungan is-a

// superclass, parent class. base class
class Hero{
    String name;

    void display(){
        System.out.println("Name : " + this.name);
    }
}
//subclass, child class, derived class
class HeroStrength extends Hero{
    // Kosong
}
class HeroIntelligent extends Hero{
    //kosong
}

public class Inheritance {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "IronMan";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Hulk";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Hawk Eye";
        hero3.display();
    }
}
