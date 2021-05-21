/*
 * �޼ҵ� �ȿ� ����� ���� ����
 * - ���ú����� ���ٽĿ��� ������ �ϰԵǸ� �� ���ú����� final Ư���� ���� �ȴ�.
 * - final: ����� ���� ������ �� ����.  
 * - ���ú���: �޼ҵ��� �Ķ����, �޼ҵ忡�� ����� ����
 *   (int arg, int local)
 * - �ǰ�: ���ú����� ���ٽĿ��� ����ϰ� �Ǹ� ������ ��������� final�� ����Ͽ�
 *         ���� ������ �� ���ٴ� ���� ��� 
 */
package section04;

public class UsingLocalVariable {
	void method(final int arg) {
		final int local = 40;
		int local2 = 50;
		
		// arg, local�� ���ٽĿ��� �����Ͽ� ������ �Ұ���(final Ư���� ���� ��)
		// arg += local;
		// local += local2;
		
		MyFunctionalInterface func = () -> {
			System.out.println("arg: " + arg);
			System.out.println("local: " + local);
		};
		
		func.method();
		
		// local2�� ���ٽĿ��� �������� �ʾ����Ƿ� ������ ����(final Ư���� ���� ����)
		local2 += local;
		System.out.println("local2: " + local2);
	}
}
