package abstracts2;

public class Fish extends Animal {
	Fish() {
		this.kind = "�����";
	}

	@Override
	public void move() {
		System.out.println("������ ���ģ��.");
	}
	
	@Override
	public void sound() {
		System.out.println("������ �����Ÿ���.");
	}
	
	@Override
	public void breathe() {
		System.out.println("������ ���ķ� ���ӿ� �ִ� ��Ҹ� ����Ͽ� ȣ���� �Ѵ�.");
	}
	
	public void swim() {
		System.out.println("������ ���ģ��.");
	}
}
