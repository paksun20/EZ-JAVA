package remocon;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ������ �� ����.
		// RemoteControl rc = new RemoteControl();
		
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();

		control(tv);
		control(audio);
	}
	
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setVolumn(5);
		rc.turnOff();
	}
}
