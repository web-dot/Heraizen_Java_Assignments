package com.heraizen.classes;

public class DVD implements RemoteControl {
	
	boolean isOn=false;
	int volume=0;
	int MAX_SOUND=20;
	int MIN_SOUND=1;

	@Override
	public boolean powerOnOff() {
		if(isOn) {
			System.out.println("power turned off");
			isOn=false;
		}
		else {
			System.out.println("power turned on");
			isOn=true;
		}
		return isOn;
	}

	@Override
	public int volumeUp(int increment) {
		if(!isOn) {
			System.out.println("power is off, swith on to increase volume");
		}
		else if(volume+increment>MAX_SOUND) {
			System.out.println("max volume reached");
		}
		else {
			volume+=increment;
		}
		return volume;
	}

	@Override
	public int volumeDown(int decrement) {
		if(volume-decrement<0) {
			System.out.println("min volume=0");
		}
		else {
			volume-=decrement;
		}
		return volume;
	}

	@Override
	public void mute() {
		volume = 0;
	}

}
