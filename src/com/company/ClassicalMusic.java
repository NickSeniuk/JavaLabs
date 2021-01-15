package com.company.MusicalComposition;

public class ClassicalMusic extends BasicMusicalComposition {
    String Musical_instrument;
    @Override
    public void OutData() {

        PrintBaseParameters();
        System.out.println("Musical instrument:  " + this.Musical_instrument );
    }

    public ClassicalMusic(String Musical_instrument,
                          String name,
                          int time)
    {
        this.setName(name);
        this.setTimeCompositionInSecond(time);
        this.Musical_instrument = Musical_instrument;
        SetWeight(4);
        setTypeMusic("Classical Music");
    }
}

