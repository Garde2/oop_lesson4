package oop_4;

//import java.util.Random;

public class Archer extends Warrior<Bow, LightShield>{

    LightShield lightShield;
    Bow bow;
    
    public Archer(String name, Bow bow, LightShield lightShield, int healthPoint) {

        super(name, bow, lightShield, healthPoint);
    }

    //int range(){

    //    Random random = new Random();
    //    return random.nextInt(weapon.range());
   // }

    @Override
    public String toString() {

        return String.format("Archer %s", super.toString());
    }

    //@Override
   // public int damage(){
   //     return 56;
    //}
}