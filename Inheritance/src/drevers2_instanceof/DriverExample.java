package drevers2_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Truck());
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
