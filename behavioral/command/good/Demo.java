package com.upgrad.designpatterns.behavioral.command.good;

import com.upgrad.designpatterns.behavioral.command.alexa.Alexa;

public class Demo {
    public static void main(String[] args) {
        Gadget light = new Light();
        Gadget musicSystem = new MusicSystem();

        OnCommand onCommand = new OnCommand(light);
        OffCommand offCommand = new OffCommand(light);

        onCommand.execute();
        offCommand.execute();

        onCommand = new OnCommand(musicSystem);
        offCommand = new OffCommand(musicSystem);

        onCommand.execute();
        offCommand.execute();
    }
}
