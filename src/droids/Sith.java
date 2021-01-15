package droids;

public class Sith extends AlphaDroid {

    public Sith(){
        healthStart = 60;
        setHealth(healthStart);
        shieldStart = 15;
        setShield(shieldStart);
        damage = 12;

        type = "Sith";
    }
}

