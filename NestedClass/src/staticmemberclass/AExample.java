/*
 * [���� ���� Ŭ���� ��� ����]
 */
package staticmemberclass;

public class AExample {

	public static void main(String[] args) {
		/*
		 * �ܺ� Ŭ������ A�� �������� �ʾƵ�
		 * A�� ���� Ŭ������ C�� ��ü�� ������ �� �ִ�.
		 */ 
		// A a = new A();
		
		System.out.println("A.C.staticfieldC(���� �ʵ�) : " + A.C.staticfieldC);
		A.C.staticMethodC();
		
		A.C c = new A.C();
		c.methodC();
		
		// �ν��Ͻ� �޼ҵ�� ��ü�� ���ؼ��� ����(ȣ��) �� �� �ִ�.
		// A.C.methodC();
		
		System.out.println("A.C.staticfieldC(���� �ʵ�) : " + A.C.staticfieldC);
		A.C.staticMethodC();
		
		A.C.D d = new A.C.D();
		
		A.C.E e = c.new E();
		
	}
}
