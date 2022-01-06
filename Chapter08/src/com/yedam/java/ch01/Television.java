package com.yedam.java.ch01;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//메서드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
	System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : " +this.volume);
	}

}
