package abstracts2;

public class Dog extends Animal {
	Dog() {
		this.kind = "������";
	}
	
	@Override
	public void move() {
		System.out.println("���� �Ȱų� �޸���.");
	}
	
	@Override
	public void sound() {
		System.out.println("���� ¢�´�.");
	}
}
