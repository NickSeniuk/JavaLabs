package com.company;

import com.company.commands.*;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Program
{
    Recording recording = new Recording();
    Devoloper devoloper = new Devoloper(
            new AddNewCompositionCommand(recording),
            new SearchCompositionCommand(recording),
            new SortCommand(recording),
            new TheDuratoinOfTheCompositionCommand(recording),
            new SouCommand(recording),
            new AddCompositionFromFileCommand(recording)
    );

    public static class MyFilter implements Filter {

        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("IN_FILE");

        }
    }
    int select;
    Scanner scanner = new Scanner(System.in);
    private final Logger LOGGER = Logger.getLogger(Program.class.getName());


    public Program() {
    }

    public void Work() throws IOException {
        Handler fileHandler = new LoggerFile().GetFile();
        fileHandler.setFilter(new MyFilter());
        LOGGER.addHandler(fileHandler);

        while (true)
        {
            PrintMenu();
            SelectMenuItem();
        }
    }
    private void PrintMenu()
    {
        System.out.println("Choose what you want to do:" +
                "\n1. Enter data from keyboard" +
                "\n2. Enter data from file" +
                "\n3. Print data" +
                "\n4. Duration of composition" +
                "\n5. Sort Composition" +
                "\n6. Compositions corresponding to a given interval of the length range" +
                "\n7. Exit");
    }

    private void SelectMenuItem() throws IOException {
        select = scanner.nextInt();
        if(select<0||select>7){
            LOGGER.warning("The value cannot be less than 0 or greater than 7");
            LOGGER.setUseParentHandlers(false);
            LOGGER.info("An error occurred while selecting the menu itemIN_FILE");
            LOGGER.setUseParentHandlers(true);

        }
        switch (select) {
            case 1 -> devoloper.Execute(0);
            case 2 -> devoloper.Execute(5);
            case 3 -> devoloper.Execute(4);
            case 4 -> devoloper.Execute(3);
            case 5 -> devoloper.Execute(2);
            case 6 -> devoloper.Execute(1);
            case 7 -> System.exit(0);

        }

    }


}

