package section04;

public class CompareMethodExample2 {

	public static void main(String[] args) {
		// Pair<String, String> p1 = new Pair<String, String>("����1", "���");
		// Pair<String, String> p2 = new Pair<String, String>("����2", "���");
		// boolean result1 = Util.<String, String>compare(p1,p2);
		
		Pair<String, String> p1 = new Pair<>("����1", "���");
		Pair<String, String> p2 = new Pair<>("����2", "���");
		boolean result1 = Util.compare(p1,p2);
		if(result1) {
			System.out.println("�������� ���� ��ü(p1, p2)");
		}
		else {
			System.out.println("�������� �ٸ� ��ü(p1, p2)");
		}
	}

}
