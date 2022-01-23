package com.upgrad.designpatterns.behavioral.command.good;

import com.upgrad.designpatterns.behavioral.command.good.Command;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
