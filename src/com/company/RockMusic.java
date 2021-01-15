package com.company.MusicalComposition;

public class RockMusic extends BasicMusicalComposition{
    String DirectionRock;
    @Override
    public void OutData() {
        PrintBaseParameters();
        System.out.println("Direction of Rock:  " + this.DirectionRock );
    }

    public RockMusic(String DirectionRock,
                     String name,
                     int time)
    {
        this.setName(name);
        this.setTimeCompositionInSecond(time);
        this.DirectionRock = DirectionRock;
        SetWeight(3);
        setTypeMusic("Rock Music");
    }
}
