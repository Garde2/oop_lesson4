package oop_4;

public class NoShield extends LightShield {

    @Override
    public int endurance() {
        
        return 0;
    }
    @Override
    public int protection() {

        return 0;
    }
    @Override
    public String toString() {

        return "Нет щита = беда! : " + super.toString();
    }
    
}
