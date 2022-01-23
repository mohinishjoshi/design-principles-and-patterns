package com.upgrad.designpatterns.behavioral.command.alexa;

import javax.print.DocFlavor;

public class AlexaDemo {

    public static void main(String[] args) {
        String LIGHT_ON = "media/lightOn.mp3";
        String LIGHT_OFF = "media/lightOff.mp3";
        String MUSIC_ON = "media/musicOn.mp3";
        String MUSIC_OFF = "media/musicOff.mp3";

        Alexa alexa = new Alexa();

        alexa.performAudioCommand(LIGHT_ON);
        System.out.println("========================================================\n\n");
//        alexa.performAudioCommand(LIGHT_OFF);
        alexa.performAudioCommand(MUSIC_ON);
//        alexa.performAudioCommand(MUSIC_OFF);
    }
}
