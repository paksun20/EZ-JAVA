package section03.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(100, 32), "ȫ�浿");
		hashMap.put(new Key(200, 33), "�̼���");
		hashMap.put(new Key(200, 33), "����ġ"); // �̼����� ����ġ�� �ٲ�
		
		
		String value = hashMap.get(new Key(100, 32));
		System.out.println(value);
		
		String value2 = hashMap.get(new Key(200, 33));
		System.out.println(value2);


	}

}
