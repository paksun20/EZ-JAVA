/*
 * ���ڿ� �и�, ����
 * ����ǥ����: 
 */
package section08.strings;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,������-�ָ�ȣ/����ġ";
		
		String[] names = text.split("&|,|-|/");
		
		System.out.println("names.length=" + names.length);
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
