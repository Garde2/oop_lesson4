package oop_4;

public class Main {
    public static void main(String[] args) {

        Team<Archer> archersTeam = new Team<>();

        archersTeam.add(new Archer("Skp", new Bow(), new AnotherLightShield(), 30))
                    .add(new Archer("Nonetto", new Bow(), new JustALightShield(), 25));
        
        Team<Assasin> assasinTeam = new Team<>();

        assasinTeam.add(new Assasin("Cature",new Knife(), new NotSuchAHeavyShield(), 20))
                    .add(new Assasin("Brogun", new Knife(), new VeryHeavyShield(), 35));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        
        Battle placeOfBattle = new Battle(new Archer("Gardie", new Bow(), new NoShield(), 50), 
                               new Assasin("Iyvan", new Knife(), new NotSuchAHeavyShield(), 32));

        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }
    
}