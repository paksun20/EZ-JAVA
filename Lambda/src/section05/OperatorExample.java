/*
 * Operator �Լ��� �������̽�
 * 
 * @FunctionalInterface
 * public interface IntBinaryOperator {
 *     int applyAsInt(int left, int right);
 * }
 */
package section05;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 70, 80, 90 };

	public static int maxTest() {
		int result = scores[0];
		for(int score : scores) {
			System.out.println(score);
			/*
			 * ���ٽ� �ڵ�
			 * result = operator.applyAsInt(result, score);
			 */
			if(result >= score) {
				result = result;
			}
			else {
				result = score;
			}

		}
		return result;
	}

	/*
	 * Binary Operation
	 * result = left + right;
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score :  scores) {
			System.out.println(score);
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = maxTest();
		System.out.println("max:" + result);
		// maxValue();
		// minValue();
	}

	public static void maxValue() {
		int max = maxOrMin(
			(a,b) -> {
				if(a >= b) {
					return a;
				}
				else {
					return b;
				}
			}
		);	
		
		System.out.println("max: " + max);
	}

	public static void minValue() {
		int min = maxOrMin((a,b) -> {
			if(a <= b) {
				return a;
			}
			else {
				return b;
			}
		});	
		
		System.out.println("min: " + min);
	}
}
