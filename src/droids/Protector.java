package droids;

public class Protector extends  AlphaDroid{

    public int aura = 100;
    public Protector(){
        healthStart = 50;
        setHealth(healthStart);
        shieldStart = 5;
        setShield(shieldStart);
        damage = 5;
        type = "Protector";
    }
    public void setAura(AlphaDroid droid)
    {
        int auraSet = 5;
        if(aura >= auraSet) {
            droid.setHealth(droid.getHealth() + auraSet);
            aura -= auraSet;
        }
    }

    public int getAura(){
        return aura;
    }



    @Override
    public void showInfo(){
        super.showInfo();
        System.out.print("; aura: " + aura);

    }
}

