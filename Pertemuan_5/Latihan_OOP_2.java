package com.pboreg;

    // player
    class Player2{
        String name;
        double health;
        int level;
        // object member
        Weapon2 weapon;
        Armor2 armor;

        Player2(String name, double health){
            this.name = name;
            this.health = health;
        }

        void attack2(Player2 opponent){
            double attackPower = this.weapon.attackPower;

            System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
            opponent.defence2(attackPower);
        }

        void defence2(double attackPower){
            // akan mengambil damage
            double damage;
            if (this.armor.defencePower < attackPower){
                damage = attackPower - this.armor.defencePower;
            } else {
                damage = 0;
            }

            this.health -= damage;
            System.out.println(this.name + " gets damage " + damage);
        }

        void equipWeapon(Weapon2 weapon){
            this.weapon = weapon;
        }

        void equipArmor(Armor2 armor){
            this.armor = armor;
        }

        void display(){
            System.out.println("\nName : " + this.name);
            System.out.println("Health : " + this.health + " hp");
            this.weapon.display();
            this.armor.display();
        }
    }

    // senjata
    class Weapon2{
        double attackPower;
        String name;

        Weapon2(String name, double attackPower){
            this.name = name;
            this.attackPower = attackPower;
        }

        void display(){
            System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
        }
    }

    // armor
    class Armor2{
        double defencePower;
        String name;

        Armor2(String name, double defencePower){
            this.name = name;
            this.defencePower = defencePower;
        }

        void display(){
            System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
        }
    }

    public class Latihan_OOP_2{

        public static void main(String[] args) {

            // membuat object player
            Player2 status1 = new Player2("Bravo",100);
            Player2 status2 = new Player2("Slizzer",50);

            // membuat object weapon
            Weapon2 pedang = new Weapon2("pedang",15);
            Weapon2 ketapel = new Weapon2("ketapel",1);

            // membuat object armor
            Armor2 bajuBesi = new Armor2("baju besi",10);
            Armor2 kaos = new Armor2("kaos",0);

            // player 1
            status1.equipWeapon(pedang);
            status1.equipArmor(bajuBesi);
            status1.display();

            // player 2
            status2.equipWeapon(ketapel);
            status2.equipArmor(kaos);
            status2.display();

            System.out.println("\nPERTEMPURAAAN");
            System.out.println("\nEpisode - 1\n");
            status1.attack2(status2);
            status1.display();
            status2.display();
            System.out.println("\nEpisode - 2\n");
            status2.attack2(status1);
            status1.display();
            status2.display();
        }
    }

