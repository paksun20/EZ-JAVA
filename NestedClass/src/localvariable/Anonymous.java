package localvariable;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		this.field = 10;
		// arg1 = 20;
		arg2 = 30;
		// var1 = 40;
		var2 = 50;
		
		int result = field + arg1 + arg2 + var1 + var2;
		System.out.println("result : " + result);
	}
	
	/*
	 * �޼ҵ忡�� �͸� ���� ��ü�� �޼ҵ��� �Ķ���ͳ� ���ú����� ����ϸ�
	 * final Ư���� ���´�.
	 */
	public void method2(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		int x = 0;
		
		this.field = 10; // ��� �ʵ�
		
		// final Ư������ ����Ǿ� ���� ������ �� ����.
		// arg2 = 30;
		// var2 = 50;
		
		x = 10;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		x += calc.sum();
		
		System.out.println("calc.sum : " + calc.sum());
		System.out.println("x : " + x);
	}
	
}
