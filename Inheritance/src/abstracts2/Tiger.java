package abstracts2;

public class Tiger extends Cat {
	Tiger() {
		this.kind = "ȣ����";
	}
	
	@Override
	public void move() {
		System.out.println("ȣ���� �Ȱų� �޸���.");
	}
	
	@Override
	public void sound() {
		System.out.println("ȣ���̴� ��ȿ�Ѵ�.");
	}
	
	public void breathe() {
		System.out.println("ȣ���̵� ȣ���� �Ѵ�.");
	}
}
