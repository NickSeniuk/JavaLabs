package com.company.commands;

import com.company.Recording;

import java.util.Scanner;

public class SearchCompositionCommand extends Command {
    @Override
    public void execute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the space where you want to find [start; end: ]");
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int i=0; i<recording.getList().size(); i++)
        {
            if(recording.getList().get(i).getTimeCompositionInSecond()>=start
                    &&recording.getList().get(i).getTimeCompositionInSecond()<=end)
            {
                recording.getList().get(i).OutData();
            }
        }

    }
    public SearchCompositionCommand(Recording recording)
    {
        this.recording = recording;
    }
}

