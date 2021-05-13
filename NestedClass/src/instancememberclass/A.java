/*
 * [�ν��Ͻ� ��� Ŭ���� ����]
 * - �ܺ� Ŭ������ ��ü�� �����ؾ߸� ���� Ŭ������ ����� �� �ִ�.
 * - ���� Ŭ������ ����(static) �ʵ�� �޼ҵ带 ������ �� ����.
 */
package instancememberclass;

public class A { // �ܺ� Ŭ����
	A() {
		System.out.println("A(�ܺ�) Ŭ���� ����");
	}
	
	// ���� Ŭ����(�ν��Ͻ� ��� Ŭ����)
	// B�� A�� �ν��Ͻ�ȭ �Ǿ� ��ü�� �Ǿ��� �� ����� �� �ִ�.
	class B {
		// ���� �ʵ带 ���� �� �� ����.
		// static int staticfieldx = 0;
		
		B() {
			System.out.println("B(����) Ŭ���� ����");
		}
		
		void methodB() {
			System.out.println("B(����) methodB() �޼ҵ�");
		}

		// ���� �޼ҵ带 ������ �� ����.
		/*
		static void staticmethodx() {
		}
		*/
	}
}
