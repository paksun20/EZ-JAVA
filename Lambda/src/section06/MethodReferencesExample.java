package section06;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		referenceStaticMethod();
		referenceinstanceMethod();
		
	}
	
	public static void referenceStaticMethod() {
	
	    IntBinaryOperator operator = (x, y) -> Calc.staticMethod(x, y);
		System.out.println("정적메소드: " + operator.applyAsInt(10, 20));

		operator = Calc :: staticMethod;
		System.out.println("정적메소드2: " +  operator.applyAsInt(10, 20));
	}
		
	public static void referenceinstanceMethod() {
		//인스턴스 메소드 참조 ---------------------------
		Calc obj = new Calc();
		IntBinaryOperator operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("인스턴스 메소드 : " + operator.applyAsInt(5, 6));

		IntBinaryOperator operator2 = obj:: instanceMethod;
		System.out.println("인스턴스 메소드 : " + operator2.applyAsInt(7, 8));
	}
}
