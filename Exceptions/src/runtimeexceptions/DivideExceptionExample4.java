package runtimeexceptions;

public class DivideExceptionExample4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		try {
			z = x / y;
		}
		catch(ArithmeticException e) { // throw new ArithmeticException();
			System.out.println("x�� ���� 0���� �������� �߽��ϴ�.");
		}
		
		System.out.println("z=" + z);
	}

}
