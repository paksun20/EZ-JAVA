/*
 * [Static Nested Class]
 * static���� Ŭ������ �����ϸ� Ŭ������ �и� ��
 * Wheel Ŭ������ ���� Ŭ������ Car Ŭ������ ��� ������ ������ �� ����
 * Static nested class�� ���� Ŭ������ �������� �ʾƵ�, �ܺο��� ���� ��ü�� ���� ����
 */
package statics.staticclass;

public class Truck {
	String vehicles = "sports car"; 
	
	public Truck() {}
	
	public static class Wheel {
		public Wheel() {
			// Cannot make a static reference to the non-static field vehicles
			// vehicles = "taxi";
			System.out.println("Wheel() !!!");
		}
	}
	
	public static void main(String[] args) {
		Truck.Wheel wheel = new Truck.Wheel();
		
	}
}
