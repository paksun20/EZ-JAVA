/*
 * A�� ���� Ŭ���� B�� ����ϱ� ���ؼ���
 * A�� �ν��Ͻ�ȭ �Ǿ� ��ü�� �Ǿ��� �� ����� �� �ִ�.
 */
package instancememberclass;

public class AExample {

	public static void main(String[] args) {
		A abc = new A();
		
		/*
		 * ���� Ŭ���� ���� �� �޼ҵ� ����
		 */
		// ���� ��� Ŭ����
		// A.B bobj = new A.B();
		
		A.B bobj = abc.new B();
		bobj.methodB();
	}

}
