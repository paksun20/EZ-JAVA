package remocon;

public abstract class Telvison implements RemoteControl {

	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("Ƽ�� �ѱ�");

	}

	@Override
	public void turnOff() {
		System.out.println("Ƽ�� ����");

	}

	public void setVolum(int volumn) {
		System.out.println("��������");
        if(volumn > RemoteControl.MAX_VALUE) {
        	volumn = RemoteControl.MAX_VALUE;
        }
        else if(volumn < RemoteControl.MIN_VALUE) {
        	volumn = RemoteControl.MIN_VALUE;
        }
        else  {
        	this.volumn = volumn;
        }
        
        System.out.println("Ƽ�񺼷� : " + this.volumn);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
	}
	
}
