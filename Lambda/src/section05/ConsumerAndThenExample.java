package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> { 
			System.out.println("consumerA(�̸�)") ;
			System.out.println("�̸� : " + m.getName()); 
			System.out.println("���̵� : " + m.getId()); 
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB(�ּ�) : ");
			Address address = m.getAddress();
			System.out.println("���� : " + address.getCountry());
			System.out.println("���� : " + address.getCity());
			};
		
		System.out.println("[andThen]");
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", new Address("����", "�Ѿ�")));
	}
}
