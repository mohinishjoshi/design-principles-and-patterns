package com.upgrad.designpatterns.behavioral.command.bad;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        light.on();
        light.off();

        MusicSystem musicSystem = new MusicSystem();
        musicSystem.on();
        musicSystem.off();

    }
}
