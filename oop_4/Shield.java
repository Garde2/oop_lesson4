package oop_4;

public abstract class Shield implements Defence {

    public abstract int endurance();

    @Override
    public String toString() {
        
        return String.format("Защита: %d, %d", protection(), endurance());
    }
}
