package com.heraizen.classes;

public class TestRemoteControl {

	public static void main(String[] args) {
		
		RemoteControl r1 = new DVD();
		
		System.out.println(r1.powerOnOff()); //power on
		System.out.println(r1.powerOnOff());//power off
		
		
		System.out.println(r1.volumeUp(10));// can not volumeUp as power off
		
		System.out.println(r1.powerOnOff());//power on
		System.out.println(r1.volumeUp(10));//volumeUp works
		
		System.out.println(r1.volumeUp(10));//again volume up
		
		System.out.println(r1.volumeUp(1));//can not volume up, max volume reached
		
		System.out.println(r1.powerOnOff()); //turned off, go to bed
		

	}

}
