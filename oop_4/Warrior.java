package oop_4;

import java.util.Random;

public abstract class Warrior<T extends Weapon, E extends Defence> {

    private String name;
    protected T weapon;
    protected E defence;
    private int healthPoint;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }    

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public E getDefence() {
        return defence;
    }

    public void setDefence(E defence) {
        this.defence = defence;
    }

    public Warrior(String name, T weapon, E defence, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.defence = defence;
        this.healthPoint = healthPoint;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, defence %s, healthPoint %d", name, weapon, defence, healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}