package com.upgrad.designpatterns.behavioral.command.good;

public class MusicSystem implements Gadget{

    private boolean playing = false;

    public boolean isOn() {
        return playing;
    }

    public void toggle() {
        if (playing) {
            off();
        } else {
            on();
        }
        playing = !playing;
    }



    public void on() {
        System.out.println("Music System is Playing some Music.");
    }

    public void off() {
        System.out.println("Silence. Music Off.");
    }
}

