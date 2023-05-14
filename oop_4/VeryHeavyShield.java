package oop_4;

public class VeryHeavyShield extends HeavyShield{

    @Override
    public int endurance() {

        return 150;
    }
    @Override
    public int protection() {

        return 200;
    }
    @Override
    public String toString() {
        
        return "ОченьТяжелыйЩит: " + super.toString();
    }
    
}
