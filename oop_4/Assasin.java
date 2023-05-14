package oop_4;

public class Assasin extends Warrior<Knife, HeavyShield> {

    LightShield lightShield;

    public Assasin(String name, Knife knife, HeavyShield heavyShield, int healthPoint) {

        super(name, knife, heavyShield, healthPoint);
    }

    //@Override
    //public int damage() {

    //    return 50;
    //}

    @Override
    public String toString() {

        return String.format("Assasin %s", super.toString());
    }
}