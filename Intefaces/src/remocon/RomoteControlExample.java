package remocon;

public class RomoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Telvison();
						
		tv.turnOn();
		tv.setVolum(5);
		tv.turnOff();
	}

}
