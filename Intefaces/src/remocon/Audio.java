package remocon;

public class Audio implements RemoteControl {
	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("Audio �ѱ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ����");
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VALUE) {
			volumn = RemoteControl.MAX_VALUE;
		}
		else if(volumn < RemoteControl.MIN_VALUE) {
			volumn = RemoteControl.MIN_VALUE;
		}
		else {
			this.volumn = volumn;
		}
		
		System.out.println("Audio ���� :" + this.volumn);
	}
}
