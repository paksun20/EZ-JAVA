package abstracts2;

public class TigerExample2 {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.breathe();
		
		Cat cat = (Cat)animal;
		cat.breathe();
		
		// �θ� ��ü�� �ڽ� ��ü�� ĳ������ �ϸ� ���� ������ �߻��Ѵ�.
		// ���ܹ߻�(java.lang.ClassCastException)
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
}
