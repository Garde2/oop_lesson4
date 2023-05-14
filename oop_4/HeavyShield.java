package oop_4;

public abstract class HeavyShield extends Shield{

    public abstract  int endurance();

    @Override
    public String toString() {
        
        return String.format("Прочность щита %d, защита %d", endurance(), protection());
    }
}
