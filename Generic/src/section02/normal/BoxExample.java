package section02.normal;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");
		String str = (String)box.get();
		System.out.println(str);
		
		box.set(100);
		int x = (int)box.get();
		System.out.println(x);

		/*
		 * Object�� �����ϰ� �Ǹ� ��� Ÿ���� ���� ������ �� ������
		 * �߸��� ĳ�������� ���� ������ ���ɼ��� �ִ�.
		 */
		box.set(new Apple());
		// String apple = (String)box.get();
		// int apple = (int)box.get();
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
