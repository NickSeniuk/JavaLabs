package com.company;

import com.company.commands.Command;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Devoloper
{
    Command[] arr = new Command[6];

    public Devoloper(Command addNew, Command search, Command sort, Command duration, Command sou, Command fromFileAdd)
    {
        this.arr[0] = addNew;
        this.arr[1] = search;
        this.arr[2] = sort;
        this.arr[3] = duration;
        this.arr[4] = sou;
        this.arr[5] = fromFileAdd;

    }
    public void Execute(int num) throws IOException {
        this.arr[num].execute();
    }



}

