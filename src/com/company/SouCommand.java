package com.company.commands;

import com.company.Recording;

public class SouCommand extends  Command {
    @Override
    public void execute() {
        System.out.println("All your music:"+
                "\n-----------------------------------");
        for(int i=0; i < recording.getList().size(); i++)
        {
            recording.getList().get(i).OutData();
        }
        System.out.println("-----------------------------------");
    }
    public SouCommand(Recording recording)
    {
        this.recording = recording;
    }

}

