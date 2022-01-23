package com.upgrad.designpatterns.behavioral.command.good;

public class ToggleCommand implements Command {

	private Gadget gadget;

	public ToggleCommand(Gadget gadget) {
		this.gadget = gadget;
	}

	@Override
	public void execute() {
		gadget.toggle();
	}
}