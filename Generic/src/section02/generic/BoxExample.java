package section02.generic;

public class BoxExample {

	public static void main(String[] args) {
		// Box<String> box = new Box<String>();
		Box<String> box = new Box<>();
		box.set("���ʸ�");
		
		// ĳ������ �� �ʿ䰡 ����.
		// String str = (String)box.get();
		String str = box.get();
		System.out.println(str);
	}

}
