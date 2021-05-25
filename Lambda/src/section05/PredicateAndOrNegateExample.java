package section05;

	import java.util.function.IntPredicate;

	public class PredicateAndOrNegateExample {
		public static void main(String[] args) {
			PredicateAnd();
		}
		
		public static void PredicateAnd() {
			
			IntPredicate preA = a -> a%2 == 0;
			IntPredicate preB = (a) -> a%3 == 0;
			
			//And()
			IntPredicate preAB = preA.and(preB);
			boolean result = preAB.test(9);
			System.out.println("9는 2와 3의 배수입니까? " + result);

			//or()
			preAB = preA.or(preB);
			result = preAB.test(9);
			System.out.println("9는 2 또는 3의 배수입니까? " + result);
			
			//negate()
			preAB = preA.negate();
			result = preAB.test(9);
			System.out.println("8는 홀수입니까? " + result);

		}
	}
