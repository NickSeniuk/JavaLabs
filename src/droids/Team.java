package droids;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public ArrayList<AlphaDroid> DroidsList;
    public String Name;
    public Team(String name){
        Name = name;
        DroidsList = new ArrayList<AlphaDroid>();
    }

    public boolean isAlive(){
        for(int i = 0; i < DroidsList.size(); i++)
        {
            if(DroidsList.get(i).isAlive())
                return true;
        }

        return false;

    }

    public AlphaDroid GetDroidReadyToAura(AlphaDroid pro)
    {
        AlphaDroid d = null;
        for(int i = 0; i < DroidsList.size(); i++)
        {
            d = DroidsList.get(i);
            if (d!= pro && d.isAlive() && d.getHealth() < d.getStartHealth())
                return d;
        }
        return null;
    }

    public AlphaDroid GetDroidReadyToAttack()
    {
        AlphaDroid d = null;
        for(int i = 0; i < DroidsList.size(); i++)
        {
            d = DroidsList.get(i);
            if (d.isAlive() && d.isCanFight)
                return d;
        }
        return null;
    }

    public AlphaDroid GetDroidReadyToDefence()
    {
        AlphaDroid d = null;
        for(int i = 0; i < DroidsList.size(); i++)
        {
            d = DroidsList.get(i);
            if (d.isAlive())
                return d;
        }
        return null;
    }


    public void prepareToBattleRound(){
        for(int i = 0; i < DroidsList.size(); i++)
        {
            DroidsList.get(i).isCanFight = DroidsList.get(i).getHealth() > 0;
        }

    }

    public void addDroid(AlphaDroid droid){

        DroidsList.add(droid);
    }

    public void addDroid(){
        AlphaDroid droid = createDroid();
        DroidsList.add(droid);
    }

    public void showInfo(){
        System.out.println(Name + ":");
        for(int i = 0; i < DroidsList.size(); i++)
        {
            System.out.print(String.valueOf(i+1) + ". ");
            DroidsList.get(i).showInfo();
            System.out.println();
        }
    }

    public  AlphaDroid createDroid()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Виберіть тип дроіда , що додається в команду: 1 - Chubaka ; 2 - Sith; 3 - Protector;");
        int i = scanner.nextInt();
        AlphaDroid droid = null;

        switch(i)
        {
            case 1:
                droid = new Chubaka();

                break;
            case 2:
                droid = new Sith();
                break;
            case 3:
                droid = new Protector();

        }
        droid.setName(Name.substring(0,1) + "_" + droid.type.substring(0,3) + String.valueOf(DroidsList.size() + 1));

        return droid;
    }


}

