/*
 * [Static Class]
 * static class�� ���� Ŭ������ ������ ���� ����
 */
package statics.staticclass;

// error
// public static class Taxi {

public class Taxi {
	String vehicles = "sports car"; 
	
	public Taxi() {}
	
	public static class Wheel {
		static String tire = "NEXEN TIRE";
		
		public Wheel() {}
		
		String getTires() {
			return Wheel.tire;
		}
	}
	
	public static void main(String[] args) {
		Taxi.Wheel wheel = new Taxi.Wheel();
		System.out.println("vehicles=" + wheel.getTires());
	}
}
