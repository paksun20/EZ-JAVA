package section05;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		MinByOperator();
		maxByOperator();
	}
		
		public static void MinByOperator() { 
		BinaryOperator<Fruit> operator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));
		Fruit fruit = operator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
		
	}
		
		public static void maxByOperator() { 
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy((f1,f2)-> f1.name.compareTo(f2.name));
		Fruit fruit = operator.apply(new Fruit("파인애플", 6000), new Fruit("홍초", 10000));
		System.out.println("이름비교 : " + fruit.name);
		
	}
		
}