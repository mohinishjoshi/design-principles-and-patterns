package com.upgrad.designpatterns.behavioral.command.alexa;

import com.upgrad.designpatterns.behavioral.command.good.*;

public class Alexa {
    private Light light;
    private MusicSystem musicSystem;
    private AsyncTranscribeLocalMediaFile audioService;

    public Alexa() {
        this.light = new Light();
        this.musicSystem = new MusicSystem();
        this.audioService = new AsyncTranscribeLocalMediaFile();
    }

    public void performAudioCommand(String filepath){
        String commandText = this.audioService.transcribeAudio(filepath);
        Command toggleCommand = null;

        System.out.println("**************************************************************");
        System.out.println("INPUT:");
        System.out.println(commandText);
        System.out.println("**************************************************************");

        commandText = commandText.toLowerCase();
        if(commandText.indexOf("light") >= 0){
            toggleCommand = getLightCommand(commandText);

        } else {
            toggleCommand = getMusicSystemCommand(commandText);
        }
        if(toggleCommand != null){
            toggleCommand.execute();
        }
    }

    private Command getLightCommand(String commandText) {
        Command command = null;
        if(commandText.indexOf("on") >= 0){
            command = new OnCommand(light);
        } else {
            command = new OffCommand(light);
        }
        return command;
    }

    private Command getMusicSystemCommand(String commandText) {
        Command command = null;
        if(commandText.indexOf("on") >= 0){
            command = new OnCommand(musicSystem);
        } else {
            command = new OffCommand(musicSystem);
        }
        return command;
    }

//    public void performTextCommand(String commandText){
//        Command toggleCommand = null;
//        commandText = commandText.toLowerCase();
//        if(commandText.indexOf("toggle") >= 0 && commandText.indexOf("light") >= 0){
//            toggleCommand = new ToggleCommand(light);
//
//        } else {
//            toggleCommand = new ToggleCommand(musicSystem);
//        }
//        toggleCommand.execute();
//    }
}
