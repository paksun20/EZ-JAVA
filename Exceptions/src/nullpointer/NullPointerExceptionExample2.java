package nullpointer;

public class NullPointerExceptionExample2 {

	public static void main(String[] args) {
		String data = null;
		if(data != null) {
			System.out.println(data.toString());
		}
		else {
			System.out.println("data is null");
			System.out.println(data); // ���ο��� null üũ�� �ؼ� ����� �߱� ������ ������ ������ ����
		}
	}

}
