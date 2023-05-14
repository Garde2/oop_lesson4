package oop_4;

public class NotSuchAHeavyShield  extends HeavyShield{

    @Override
    public int endurance() {

        return 100;
    }
    @Override
    public int protection() {

        return 150;
    }
    @Override
    public String toString() {
        
        return "НеТакойУжИТяжелыйЩит: " + super.toString();
    }
    
}
