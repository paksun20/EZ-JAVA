/*
 * try catch���� finally�� �ɼ����� try�� catch���� ���� �� �� ���������� �׻� ����Ǵ� ���̴�. 
 * ���������� try���� ����ǰų� ���ܰ� �߻��Ͽ� catch���� ����Ǿ ���������� �׻� ����ȴ�. 
 * finally ������ �ݵ�� ����Ǿ�� �� ó�� ��ƾ�� ����Ѵ�.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample5 {

	public static void main(String[] args) {
		System.out.printf("main(args.length=%d)\n", args.length);

		int result = add(args);
		System.out.println("result=" + result);
	}
	
	static int add(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			int result = val1 + val2;
			return result;
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException: ���ڷ� ��ȯ�� �� ���� ���ڿ��Դϴ�.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: �迭 �ε��� ������ �Ѿ� �����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("Exception e: ���� �߻�!!!!");
		}
		finally {
			System.out.println("finally: ���ڿ��� �ٽ� �Է��ϼ���");
		}
		
		return -1;
	}
}
