/*
 * Function�� ������ ����
 * - Function<>.compose()�� �ùķ��̼�
 */
package section05;

import java.util.function.Function;

public class FunctionAndThenComposeExample3 {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (Member member) -> {
			System.out.printf("FunctionA:(%s)(%s)\n", 
					member.getAddress().getCountry(),
					member.getAddress().getCity());
			return member.getAddress();
		};
		
		functionB = (Address addr) -> {
			System.out.printf("FunctionB:(%s)(%s)\n", addr.getCountry(), addr.getCity());
			return addr.getCity() + "[��]";
		};
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("ȫ�浿", "HGD", new Address("����", "�Ѿ�")));
		System.out.println("���ֵ���:" + city);
	}

}
