package com.upgrad.designpatterns.behavioral.command.bad;

import com.upgrad.designpatterns.behavioral.command.good.Gadget;

//receiver
public class Light implements Gadget {

	private boolean lightOn = false;

	public boolean isOn() {
		return lightOn;
	}

	public void toggle() {
		if (lightOn) {
			off();
		} else {
			on();
		}
		lightOn = !lightOn;
	}

	public void on() {
		System.out.println("Light is on.");
	}

	public void off() {
		System.out.println("Light is off.");
	}
}
