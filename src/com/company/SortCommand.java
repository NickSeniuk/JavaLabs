package com.company.commands;

import com.company.Recording;

public class SortCommand extends Command {
    @Override
    public void execute()
    {
        recording.getList().sort((o1, o2) -> o2.getWeight() - o1.getWeight());
        System.out.println("The compositions were rearranged on the disc depending on the style");
    }
    public SortCommand(Recording recording)
    {
        this.recording = recording;
    }
}

