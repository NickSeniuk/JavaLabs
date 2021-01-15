package com.company.MusicalComposition;

//народна музика
public class FolkMusic extends BasicMusicalComposition {
    String Style;
    @Override
    public void OutData() {
        PrintBaseParameters();
        System.out.println("Style:  " + this.Style );
    }

    public FolkMusic(String style,
                     String name,
                     int time)
    {
        this.setName(name);
        this.setTimeCompositionInSecond(time);
        this.Style = style;
        SetWeight(2);
        setTypeMusic("Folk Music");
    }
