/*
 * Ŭ���� ����(��ŸŬ����)
 * Class
 * - Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ����
 */
package section06.classes;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("class name: " + clazz.getName());
		System.out.println("class simplename: " + clazz.getSimpleName());
		
		System.out.println("class packagename: " + clazz.getPackage().getName());
		
		Package pack = clazz.getPackage();
		System.out.println("class packagename: " + pack.getName());
		System.out.println("class hashCode: " + pack.hashCode());
	}

}
