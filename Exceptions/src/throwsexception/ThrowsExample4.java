/*
 * ���� ���ѱ��(throws)
 * ����ó���� �޼ҵ带 ȣ���� ������ ����
 */
package throwsexception;

public class ThrowsExample4 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		findClass();
	}
	
	public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}

}
