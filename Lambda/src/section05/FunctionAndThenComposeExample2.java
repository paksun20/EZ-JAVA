/*
 * Function�� ������ ����
 * - Function<>.andThen() ó���� �ùķ��̼�
 */
package section05;

import java.util.function.Function;

public class FunctionAndThenComposeExample2 {

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
		
		Member member = new Member("ȫ�浿", "HGD", new Address("����", "�Ѿ�"));
		Address address = functionA.apply(member);
		
		functionB = (Address addr) -> {
			System.out.printf("FunctionB:(%s)(%s)\n", addr.getCountry(), addr.getCity());
			return addr.getCity() + "[��]";
		};
		
		functionB.apply(address);
	}

}
