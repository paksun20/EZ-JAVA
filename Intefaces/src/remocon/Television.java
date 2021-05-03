package remocon;

public class Television implements RemoteControl {
	private int volumn;
	private String model;
	
	Television() {}
	Television(String model) {
		this.model = model;
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s] TV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] TV ����\n", this.model);
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
		
		System.out.println("[" + this.model + "] TV ���� :" + this.volumn);
	}
	
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s] �������\n", this.model);
		}
		else {
			System.out.printf("[%s] ��������\n", this.model);
		}
	}
}
