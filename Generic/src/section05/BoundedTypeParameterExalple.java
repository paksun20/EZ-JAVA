package section05;

public class BoundedTypeParameterExalple {
	public static void main(String[] args) {

		int result = Util.compare(3.14, 2);
		System.out.println(result);
		
		int result2 = Util.compare(3.14f, 20.123f);
		System.out.println(result2);
		
		int result3 = Util.compare(3.14f, new Integer('A'));
		System.out.println(result3);
		
		boolean result4 = Util.compare("3.14", "3");
		System.out.println(result4);
	}
}
