package section06;

public class Calc {
	public static final int staticVal = 99;
	
	public static int staticMethod(int x, int y) { // ���� �޼ҵ�
		return x + y;
	}
	
	public int instanceMethod(int x, int y) { // �ν��Ͻ� �޼ҵ�
		return x + y;
	}
}
