package abstracts2;

public class Cat extends Animal {
	Cat() {
		this.kind = "�����";
	}
	
	@Override
	public void move() {
		System.out.println("����� �Ȱų� �޸���.");
	}
	
	@Override
	public void sound() {
		System.out.println("����̴� ¢�´�.");
	}
	
	public void breathe() {
		System.out.println("����̵� ȣ���� �Ѵ�.");
	}
}
