/*
 * ���� ���ѱ��(throws)
 * ���ܸ� �޼ҵ带 ȣ���� ������ ����
 */
package throwsexception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found...");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		// Class clazz = Class.forName("java.lang.String2");
		Class clazz = Class.forName("java.lang.String");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}

}
