/*
 * [Inner Class]
 * Inner Class�� ���� Ŭ������ ����
 * Wheel Ŭ������ ���� Ŭ������ Car Ŭ������ ��� ������ ���� ����
 */
package statics.staticclass;

public class Car {
	String vehicles = "sports car"; 
	
	public Car() {}
	
	public class Wheel {
		public Wheel() {
			vehicles = "taxi";
		}
	}
}
