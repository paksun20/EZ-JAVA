/*
 * �ý��� ����
 * - System.exit(exitcode)
 * - exitcode : ����(0), ������(0�� �ƴѰ�)
 */
package section05.systems;

public class ExitExample {

	public static void main(String[] args) {
		int x = 0;
		
		while(true) {
			x += 1;
			if(x > 100) {
				// System.exit(0); // ���α׷� ����
				System.exit(-99); // ���α׷� ����
			}

			if(x > 900) {
				break;
			}
			
			System.out.println(x);
		}
		
		System.out.println("THE END");
	}
}
