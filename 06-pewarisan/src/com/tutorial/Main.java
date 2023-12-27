package com.tutorial;

class Hero{
    //att
    String nama;
    String exp;
    String health;

}

// subclass
class HeroTank extends Hero{

}
public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        Hero hero_1= new Hero();

        HeroTank Hero_2 = new HeroTank();
        Hero_2.nama= "dendi";
    }
}
