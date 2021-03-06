/*
 * [표준 API의 함수적 인터페이스]
 * Consumer 함수적 인터페이스
 * public interface Consumer<T> {
 *   void accept(T t);
 * }
 */
package section05;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// Consumer<String> consumer = (t) -> { System.out.println(t + "8"); };
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("Java");
		
		Consumer<Integer> conInteger = t -> System.out.println(t + t);
		conInteger.accept(10);
		
		normal();
	}
	
	static void normal() {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t + "15");
			}
		};
		
		consumer.accept("Java");
	}

}
