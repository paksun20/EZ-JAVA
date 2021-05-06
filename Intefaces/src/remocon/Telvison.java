package remocon;

public abstract class Telvison implements RemoteControl {

	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("Æ¼ºñ ÄÑ±â");

	}

	@Override
	public void turnOff() {
		System.out.println("Æ¼ºñ ²ô±â");

	}

	public void setVolum(int volumn) {
		System.out.println("º¼·ýÁ¶Àý");
        if(volumn > RemoteControl.MAX_VALUE) {
        	volumn = RemoteControl.MAX_VALUE;
        }
        else if(volumn < RemoteControl.MIN_VALUE) {
        	volumn = RemoteControl.MIN_VALUE;
        }
        else  {
        	this.volumn = volumn;
        }
        
        System.out.println("Æ¼ºñº¼·ý : " + this.volumn);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
	}
	
}
