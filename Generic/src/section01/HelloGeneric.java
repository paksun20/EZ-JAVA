package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric {

	public static void main(String[] args) {
		normalList();
		genericList();
	}
	
	static void normalList() { // �Ϲ����� Ÿ��
		System.out.println(">>> normalList() <<<");
		List list = new ArrayList();
		list.add("hello");
		list.add(100);
		String str = (String)list.get(0);
		// String str = list.get(0);
		System.out.println("String:" +str);
		
		int x = (int)list.get(1);
		System.out.println("int:" + x);
	}

	static void genericList() { // ���ʸ� Ÿ��
		System.out.println(">>> genericList() <<<");
		
		// ������ �� Ÿ���� ����
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String str = list.get(0);
		System.out.println("String:" +str);
		
		// �پ��� Ÿ������ ����� �� ����.
		// list.add(100);
	}
}
