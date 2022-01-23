package com.upgrad.designpatterns.behavioral.command.good;

public class OnCommand implements Command {

    private Gadget gadget;

    public OnCommand(Gadget gadget) {
        this.gadget = gadget;
    }

    @Override
    public void execute() {
        gadget.on();
    }

}
