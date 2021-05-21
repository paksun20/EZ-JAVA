/*
 * �������̽��� �͸�����ü ����
 */
package section03;

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		normal();
		lambda();
	}
	
	public static void lambda() {
		MyFunctionalInterface myfunc = () -> {
			System.out.println("MyFunctionalInterface�� ���ٽ� ���� ��ü");
		};
		
		myfunc.method();
	}
	
	public static void normal() {
		MyFunctionalInterface myfunc = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface�� �͸� ���� ��ü");
			}
		};
		
		myfunc.method();
	}
}
