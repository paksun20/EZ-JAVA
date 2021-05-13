package remocon;

public class SmartTV implements RemoteControl {
	private String model = "����ƮTV";
	private int channel;
	private int volumn;

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("ä�κ���:[%s] channel(%d)\n", this.model, this.channel);
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s] SmartTV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] SmartTV ����\n", this.model);
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
		
		System.out.println("[" + this.model + "] SmartTV ���� :" + this.volumn);
	}
	

}
