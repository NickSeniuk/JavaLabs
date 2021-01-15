package com.company.MusicalComposition;

public abstract class BasicMusicalComposition
{
    String TypeMusic;
    private int Weight;
    private String name;
    private int TimeCompositionInSecond;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeCompositionInSecond() {
        return TimeCompositionInSecond;
    }

    public void setTimeCompositionInSecond(int timeCompositionInSecond) {
        if(timeCompositionInSecond < 0)
        {

            System.exit(-1);
        }
        TimeCompositionInSecond = timeCompositionInSecond;
    }
    public abstract void OutData();
    protected void PrintBaseParameters(){
        System.out.println("Type of music: " + this.getTypeMusic() +
                "\nName: " + this.getName() +
                "\nTime: " + this.getTimeCompositionInSecond());
    }

    public void setTypeMusic(String typeMusic) {
        TypeMusic = typeMusic;
    }

    public String getTypeMusic() {
        return TypeMusic;
    }

    public int getWeight() {
        return Weight;
    }

    public void SetWeight(int weight)
    {
        Weight = weight;
    }
}
