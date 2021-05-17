/*
 * ��Ʈ�� ���� ó��
 * - StringBuffer : ��Ƽ ������ ȯ�濡�� ����� �� �ֵ��� ����ȭ�� ����� Ŭ����
 * - StringBuilder : ���� ������ ȯ�濡�� ����� �� �ִ� Ŭ����
 * - String : ����� ���ڿ��� ������ �� ����.
 */
package section08.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// testString();
		// addString();
		stringBuilder();
	}
	
	static void stringBuilder() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
		
		sb.insert(4, "8");
		System.out.println(sb);
		
		sb.setCharAt(4, '7');
		System.out.println(sb);
		
		sb.replace(6, 13, "Book");
		System.out.println(sb);
		
		sb.delete(4,5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("length=" + length);
		
		String result = sb.toString();
		System.out.println(result);
		
		int pos = sb.indexOf("Study");
		System.out.println("Study pos=" + pos);
		
		int pox = sb.indexOf("Boox");
		System.out.println("Boox pox=" + pox);
	}
	

	/*
	 * String�� ���ڿ��� ������ �� ����.
	 */
	static void testString() {
		String str = "hello,�ȳ�!";
		
		System.out.println(str);
		
		// str[0] = 'x';
		// char ch = str[0];
		
		for(int cnt=0; cnt < str.length(); cnt++) {
			char ch = str.charAt(cnt);
			System.out.printf("str[%d]=%c\n",  cnt, ch);
		}
	}
	
	static void addString() {
		String str = null;
		
		str = "hello";
		str += ",";
		str += "�ȳ�";
		str += "!";
		System.out.println("addString: " + str);
	}

}
