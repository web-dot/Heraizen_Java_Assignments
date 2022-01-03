package com.heraizen.classes;

public interface RemoteControl {
	
	public boolean powerOnOff();
	public int volumeUp(int increment);
	public int volumeDown(int decrement);
	public void mute();
}
