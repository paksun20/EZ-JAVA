/*
 * �������̽��� �͸�����ü ����
 */
package section03;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface myfunc = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface�� �͸� ���� ��ü");
			}
		};
		
		myfunc.method();
		
		localImplements();
		callInnerClass();
	}
	
	/*
	 * ���� ���� Ŭ����
	 * ����: �޼ҵ� �ȿ� ����Ŭ������ ����
	 */
	public static void localImplements() {
		class MyFunctionalClass implements MyFunctionalInterface {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface�� ���� ���� Ŭ����");
			}
		}
		
		MyFunctionalClass myfunc = new MyFunctionalClass();
		myfunc.method();
	}
	
	public static void callInnerClass() {
		MyFunctionalClass myfunc = new MyFunctionalInterfaceExample.MyFunctionalClass();
		myfunc.method();
	}
	
	/*
	 * Static Inner Class: Ŭ�����ȿ� Ŭ����
	 */
	static class MyFunctionalClass implements MyFunctionalInterface {
		@Override
		public void method() {
			System.out.println("static MyFunctionalInterface�� Inner Class");
		}
	}
}
