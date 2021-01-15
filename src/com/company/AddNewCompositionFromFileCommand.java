package com.company.commands;

import com.company.MusicalComposition.ClassicalMusic;
import com.company.MusicalComposition.FolkMusic;
import com.company.MusicalComposition.RockMusic;
import com.company.Program;
import com.company.Recording;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class AddCompositionFromFileCommand extends Command {
    private final Scanner scanner = new Scanner(System.in);
    private final File ClassicalMusic = new File("E:\\3 семестр\\Прикладне програмування\\лаба 4\\ClassicalMusic.txt");
    private final File FolkMusic = new File("E:\\3 семестр\\Прикладне програмування\\лаба 4\\FolkMusic.txt");
    private final File RockMusic = new File("E:\\3 семестр\\Прикладне програмування\\лаба 4\\RockMusic.txt");
    private final Logger LOGGER = Logger.getLogger(AddCompositionFromFileCommand.class.getName());


    @Override
    public void execute() throws IOException {

        Handler fileHandler = new LoggerFile().GetFile();
        fileHandler.setFilter(new Program.MyFilter());
        LOGGER.addHandler(fileHandler);

        AddNew(ClassicalMusic, "Classical", 3);
        AddNew(FolkMusic, "Folk", 1);
        AddNew(RockMusic, "Rock", 2);

    }
    private void AddNew(File file, String str, int num) throws FileNotFoundException {
        Scanner file_scanner = new Scanner(file);
        int max = 10;
        System.out.printf("Enter number of %s music what you want read from file (max = %d)\n", str, max);
        int count_Music = scanner.nextInt();

        if(count_Music>10) {
            count_Music = 10;
            LOGGER.warning("No more than 10 values can be entered");

        }
        else if(count_Music<0){
            LOGGER.warning("You cannot enter less than 0 values");
        }

        for(int i=0; i<count_Music; i++) {
            String name = file_scanner.nextLine();
            int time = file_scanner.nextInt();
            file_scanner.nextLine();
            String string = file_scanner.nextLine();
            if(name.equals("")||time<0||string.equals("")){
                LOGGER.warning("Error in file " + file.getName() +
                        " from "+ (i*3) + " to " + (i*3 + 3) + " line");
                LOGGER.setUseParentHandlers(false);
                LOGGER.info("Error in the specified" +file.getName() + "fileIN_FILE");
                LOGGER.setUseParentHandlers(true);

            }
            if (num == 1) {
                this.recording.getList().add(new FolkMusic(string, name, time));
            } else if (num == 2) {
                this.recording.getList().add(new RockMusic(string, name, time));
            } else {
                this.recording.getList().add(new ClassicalMusic(string, name, time));
            }
        }
    }

    public AddCompositionFromFileCommand(Recording recording) {
        this.recording = recording;
    }

}
