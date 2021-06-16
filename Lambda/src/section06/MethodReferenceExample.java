/*
 * [�޼ҵ� ����]
 * - ���ٽĿ��� �޼ҵ� ����
 * - Ŭ����::�����޼ҵ�
 * - ������ü::�ν��Ͻ��޼ҵ�
 */
package section06;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		referenceStaticMethod();
		referenceInstanceMethod();
	}
	
	/*
	 * Ŭ������ �̸����� ���� �޼ҵ� ����
	 */
	public static void referenceStaticMethod() {
		IntBinaryOperator oper =  (x,y) -> Calc.staticMethod(x, y);
		System.out.println("�����޼ҵ�: " + oper.applyAsInt(10,20));
		
		IntBinaryOperator oper2 = Calc::staticMethod;
		System.out.println("�����޼ҵ�: " + oper2.applyAsInt(30,40));
		
		System.out.println("�����������: " + Calc.staticVal );
	}

	/*
	 * Ŭ������ �ν��Ͻ� ��ü ���������� �޼ҵ� ����
	 */
	public static void referenceInstanceMethod() {
		Calc calc = new Calc();
		
		IntBinaryOperator oper =  (x,y) -> calc.instanceMethod(x, y);
		System.out.println("�ν��Ͻ��޼ҵ�: " + oper.applyAsInt(10,20));
		
		IntBinaryOperator oper2 = calc::instanceMethod;
		System.out.println("�ν��Ͻ��޼ҵ�: " + oper2.applyAsInt(30,40));
	}

}
