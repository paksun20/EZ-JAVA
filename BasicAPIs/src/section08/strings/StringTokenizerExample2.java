package section08.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String text = "ȫ�浿|�Ӳ���/��&�̼���-����ġ";
		
		// StringTokenizer st = new StringTokenizer(text, "/");
		StringTokenizer st = new StringTokenizer(text, "&/|-");
		int countTokens = st.countTokens();

		System.out.println("countTokens: " + countTokens);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.printf("[%s]\n", token);
		}
		
		System.out.println("---------------------------------");
		System.out.println("countTokens: " + countTokens);

		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.printf("[%s]\n", token);
		}
		
		
	}

}
