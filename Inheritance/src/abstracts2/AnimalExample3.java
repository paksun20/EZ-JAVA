package abstracts2;

public class AnimalExample3 {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.breathe();
		
		// ��ü�� Cat���� ����� �θ� ������ �ϰ�
		// �ٽ� Cat���� ĳ�����Ͽ� ����ϴ� ���� ������ ����.
		Cat cat = (Cat)animal;
		cat.breathe();
	}
}
