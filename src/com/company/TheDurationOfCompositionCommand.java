package com.company.commands;

import com.company.Recording;

public class TheDuratoinOfTheCompositionCommand extends Command {
    @Override
    public void execute() {
        int sum_time = 0;
        for (int i=0; i<recording.getList().size(); i++)
        {
            sum_time += recording.getList().get(i).getTimeCompositionInSecond();
        }
        System.out.print("The sum of time of all compositions ");
        int hour = sum_time/3600;
        if (hour > 0)
        {
            System.out.print(hour + " h ");
            sum_time -= hour*3600;
        }
        int minute = sum_time/60;
        if (minute > 0)
        {
            System.out.print(minute + " min ");
            sum_time -= minute*60;
        }
        System.out.println(sum_time + " sec");
    }
    public TheDuratoinOfTheCompositionCommand(Recording recording)
    {
        this.recording = recording;
    }
}
