/*
 * try catch���� finally�� �ɼ����� try�� catch���� ���� �� �� ���������� �׻� ����Ǵ� ���̴�. 
 * ���������� try���� ����ǰų� ���ܰ� �߻��Ͽ� catch���� ����Ǿ ���������� �׻� ����ȴ�. 
 * finally ������ �ݵ�� ����Ǿ�� �� ó�� ��ƾ�� ����Ѵ�.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String s1 = "900";
		String s2 = "x100";
		// String s2 = "100";
		
		try {
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			int result = val1 + val2;
			System.out.println("result=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception: ���ڷ� ��ȯ�� �� ���� ���ڿ��Դϴ�.");
		}
		finally {
			System.out.println("finally: ���ڿ��� �ٽ� �Է��ϼ���");
		}
	}
}
