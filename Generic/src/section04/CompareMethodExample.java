package section04;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		// Pair<Integer, String> p2 = new Pair<Integer, String>(1, new String("���"));
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1) {
			System.out.println("�������� ���� ��ü(p1, p2)");
		}
		else {
			System.out.println("�������� �ٸ� ��ü(p1, p2)");
		}
	}

}
