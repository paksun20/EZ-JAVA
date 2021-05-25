package section06;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		referenceStaticMethod();
		referenceinstanceMethod();
		
	}
	
	public static void referenceStaticMethod() {
	
	    IntBinaryOperator operator = (x, y) -> Calc.staticMethod(x, y);
		System.out.println("�����޼ҵ�: " + operator.applyAsInt(10, 20));

		operator = Calc :: staticMethod;
		System.out.println("�����޼ҵ�2: " +  operator.applyAsInt(10, 20));
	}
		
	public static void referenceinstanceMethod() {
		//�ν��Ͻ� �޼ҵ� ���� ---------------------------
		Calc obj = new Calc();
		IntBinaryOperator operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("�ν��Ͻ� �޼ҵ� : " + operator.applyAsInt(5, 6));

		IntBinaryOperator operator2 = obj:: instanceMethod;
		System.out.println("�ν��Ͻ� �޼ҵ� : " + operator2.applyAsInt(7, 8));
	}
}
