package oop_4;

public class AnotherLightShield extends LightShield{

    @Override
    public int endurance() {
        
        return 70;
    }
    @Override
    public int protection() {

        return 100;
    }
    @Override
    public String toString() {

        return "ПростоЛёгкийЩит: " + super.toString();
    }
    
}
