package com.upgrad.designpatterns.behavioral.command.good;

public class OffCommand implements Command {

    private Gadget gadget;

    public OffCommand(Gadget gadget) {
        this.gadget = gadget;
    }

    @Override
    public void execute() {
        gadget.off();
    }

}
