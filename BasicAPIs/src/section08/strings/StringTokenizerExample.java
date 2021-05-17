package section08.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "ȫ�浿|�Ӳ���/��&�̼���-����ġ";
		
		// StringTokenizer st = new StringTokenizer(text, "/");
		StringTokenizer st = new StringTokenizer(text, "&/|-");
		int countTokens = st.countTokens();

		System.out.println("countTokens: " + countTokens);
		
		for(int i=0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.printf("[%d]=[%s]\n", i, token);
		}
		
		System.out.println("---------------------------------");
		System.out.println("countTokens: " + countTokens);

		/*
		for(int i=0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.printf("[%d]=[%s]\n", i, token);
		}
		*/
		
	}

}
