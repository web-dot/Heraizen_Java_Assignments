package com.heraizen.classes;

public class TV implements RemoteControl {
	
	boolean isOn=false;
	int volume=0;
	int MAX_SOUND=20;
	int MIN_SOUND=1;

	@Override
	public boolean powerOnOff() {
		return isOn?true:false;
	}

	@Override
	public int volumeUp(int increment) {
		if(volume+increment>MAX_SOUND) {
			System.out.println("max volume=20");
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
