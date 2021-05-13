/*
 * try catch���� finally�� �ɼ����� try�� catch���� ���� �� �� ���������� �׻� ����Ǵ� ���̴�. 
 * ���������� try���� ����ǰų� ���ܰ� �߻��Ͽ� catch���� ����Ǿ ���������� �׻� ����ȴ�. 
 * finally ������ �ݵ�� ����Ǿ�� �� ó�� ��ƾ�� ����Ѵ�.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample2 {

	public static void main(String[] args) {
		int result = add();
		System.out.println("result=" + result);
	}
	
	static int add() {
		String s1 = "900";
		String s2 = "100";
		
		try {
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			int result = val1 + val2;
			return result;
		}
		catch(NumberFormatException e) {
			System.out.println("Exception: ���ڷ� ��ȯ�� �� ���� ���ڿ��Դϴ�.");
		}
		finally {
			System.out.println("finally: ���ڿ��� �ٽ� �Է��ϼ���");
		}
		
		return -1;
	}
}
