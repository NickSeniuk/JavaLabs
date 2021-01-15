package com.company.commands;

import com.company.MusicalComposition.BasicMusicalComposition;
import com.company.MusicalComposition.ClassicalMusic;
import com.company.MusicalComposition.FolkMusic;
import com.company.MusicalComposition.RockMusic;
import com.company.Recording;

import java.util.Scanner;
import java.util.logging.Logger;

public class AddNewCompositionCommand  extends Command
{
    private final Scanner sc = new Scanner(System.in);
    private int time;
    private String name;
    private BasicMusicalComposition basicMusicalComposition;
    private final Logger LOGGER = Logger.getLogger(AddNewCompositionCommand.class.getName());

    @Override
    public void execute() {
        System.out.println("Select type of music, what you want add:");
        ListOfComposition();
        int select = sc.nextInt();
        sc.nextLine();
        switch (select) {
            case 1 -> FolkMusicInp();
            case 2 -> ClassicalMusic();
            case 3 -> RockMusicInp();
            default -> LOGGER.warning("Can't find this type of music");
        }
    }
    public  AddNewCompositionCommand(Recording recording)
    {
        this.recording= recording;
    }
    private void ListOfComposition()
    {
        System.out.println("\n1. Folk Music" +
                "\n2. Classical music" +
                "\n3. Rock musical");
    }

    private void FolkMusicInp()
    {
        EnterNameAndTime();
        System.out.println("Enter style of music:");
        String style = sc.nextLine();
        if(style.equals("")){
            LOGGER.warning("Style of music cannot be empty");
        }
        basicMusicalComposition = new FolkMusic(
                style,
                name,
                time
        );
        recording.getList().add(basicMusicalComposition);
    }
    private void ClassicalMusic()
    {
        EnterNameAndTime();
        System.out.println("Enter Musical instrument:");
        String instrument = sc.nextLine();
        if(instrument.equals("")){
            LOGGER.warning("Musical instrument cannot be empty");
        }

        basicMusicalComposition = new ClassicalMusic(
                instrument,
                name,
                time
        );
        recording.getList().add(basicMusicalComposition);

    }
    private void RockMusicInp()
    {
        EnterNameAndTime();
        System.out.println("Enter Rock direction:");
        String direction = sc.nextLine();
        if(direction.equals("")){
            LOGGER.warning("Rock direction cannot be empty");
        }
        basicMusicalComposition = new RockMusic(
                direction,
                name,
                time
        );
        recording.getList().add(basicMusicalComposition);

    }

    private void EnterNameAndTime()
    {
        System.out.println("Enter Name of music:");
        name = sc.nextLine();
        if(name.equals("")){
            LOGGER.warning("Name cannot be empty");
        }
        System.out.println("Enter time in second of Music:");
        time = sc.nextInt();
        sc.nextLine();
        if(time < 0){
            LOGGER.warning("Time cannot be less than 0");
        }
    }

}
