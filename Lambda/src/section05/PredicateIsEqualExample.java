package section05;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
	predicateNull();
	predicateNullString();
	predicateStringNull();
	predicateStringString();
    }

	public static void predicateNull() {
		Predicate<String> predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));
	}
	
	public static void predicateNullString() {
		Predicate<String> predicate = Predicate.isEqual("java8");
		System.out.println("null, java8: " + predicate.test(null));
	}
	
	public static void predicateStringNull() {
		Predicate<String> predicate = Predicate.isEqual(null);
		System.out.println("java8, null : " + predicate.test("java8"));
	}

	public static void predicateStringString() {
		Predicate<String> predicate = Predicate.isEqual("java8");
		System.out.println("java8, java8 : " + predicate.test("java8"));
	
		Predicate<String> predicate2 = Predicate.isEqual("java8");
		System.out.println("java8, java7 : " + predicate2.test("java7"));
	}

	
}
