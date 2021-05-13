/*
 * [���� ��� Ŭ���� ����]
 * �ν��Ͻ� �޼ҵ� �ȿ� ���ǵ� Ŭ����
 * - Ŭ������ ����������(public, private)�� ���� �� ����. 
 * - ���� �ʵ�� �޼ҵ带 ������ �� ����.(static�� ���� �� ����)
 */
package localmemberclass;

public class A { // �ܺ� Ŭ����
	private int x = 10;
	
	A() {
		System.out.println("A(�ܺ�) Ŭ���� ����");
	}
	
	void methodA() {
		// public class D {
		// private class D {
		class D {
			// static int staticfield = 99;
			
			private int x = 10;
			public D() {
				System.out.println("D(���� Ŭ���� ������");
			}
			
			void methodD() {
				System.out.println("D(���� Ŭ����) methodD() �޼ҵ�");
			}
			
			private void printX() {
				System.out.println("D(���� Ŭ����) printX() : " + this.x);
			}
			
			// ���� Ŭ�������� ���� Ŭ������ ���� �� ����.
			// static class E {}
			
			// ���� Ŭ�������� ���� �޼ҵ带 ���� �� ����.
			// static void staticMethod() {}
		}
		
		D d = new D();
		d.methodD();
		d.printX();
		
		// private member field(���� ����)
		// System.out.println("D(���� Ŭ����) x= : " + this.x);
	}
}
