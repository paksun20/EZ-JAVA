package abstracts2;

public class Bird extends Animal {
	Bird() {
		this.kind = "��";
	}

	@Override
	public void move() {
		System.out.println("���� ����.");
	}
	
	@Override
	public void sound() {
		System.out.println("���� �����ϴ�.");
	}
	
	public void fly() {
		System.out.println("���� ����.");
	}
}
