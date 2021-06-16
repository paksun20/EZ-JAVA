package section05;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

	public static void predicateAnd() { // ����
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB = preA.and(preB); // false = false && true, true = true && true
		
		boolean result = preAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? -> " + result);
		
		result = preAB.test(6);
		System.out.println("6�� 2�� 3�� ����Դϱ�? -> " + result);
	}
	
	public static void predicateOr() { // ����
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB = preA.or(preB); // true = false || true, false = false || false
		
		boolean result = preAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�? -> " + result);
		
		result = preAB.test(7);
		System.out.println("7�� 2 �Ǵ� 3�� ����Դϱ�? -> " + result);
	}

	public static void predicateNegate() { // ������
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB1 = preA.negate(); // true = false, false = true
		IntPredicate preAB2 = preB.negate(); // true = false, false = true
		
		boolean result = preAB1.test(9);
		System.out.println("9�� Ȧ���Դϱ�? -> " + result);
		
		result = preAB2.test(9);
		System.out.println("9�� 3�� ����Դϱ�? -> " + ((result) ? "�ƴϿ�" : "��"));
		
	}

}
