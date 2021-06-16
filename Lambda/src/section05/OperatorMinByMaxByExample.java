/*
 * minBy(), maxBy() ���� �޼ҵ�
 */
package section05;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		minByOperator();
		maxByOperator();
		minByOperator2();
		maxByOperator2();
	}
	
	public static void minByOperator() {
		BinaryOperator<Fruit> operator = BinaryOperator.minBy( (a,b) -> Integer.compare(a.price, b.price) );
		Fruit fruit = operator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println("���ݺ�:min=" + fruit.name + ", " + fruit.price);
	}
	
	public static void maxByOperator() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> Integer.compare(a.price, b.price) );
		Fruit fruit = operator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println("���ݺ�:max=" + fruit.name + ", " + fruit.price);
	}
	
	public static void minByOperator2() {
		BinaryOperator<Fruit> operator = BinaryOperator.minBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("�ٳ���", 16000), new Fruit("����", 10000));
		System.out.println("�̸���:min=" + fruit.name);
	}
	
	public static void maxByOperator2() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("���ξ���", 6000), new Fruit("����", 10000));
		System.out.println("�̸���:max=" + fruit.name);
	}

}


class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}