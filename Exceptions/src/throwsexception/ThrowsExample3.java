/*
 * ���� ���ѱ��(throws)
 * ����ó���� �޼ҵ带 ȣ���� ������ ����
 */
package throwsexception;

public class ThrowsExample3 {

	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}

}
