package remocon;

public class SmartTVExample {

	public static void main(String[] args) {
		RemoteControl smarttv = new SmartTV();

		// �������̽� Ȯ��(default method)
		smarttv.setChannel(11);
		
		RemoteControl.control(smarttv);
	}
}
