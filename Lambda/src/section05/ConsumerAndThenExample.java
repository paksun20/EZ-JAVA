package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> { 
			System.out.println("consumerA(이름)") ;
			System.out.println("이름 : " + m.getName()); 
			System.out.println("아이디 : " + m.getId()); 
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB(주소) : ");
			Address address = m.getAddress();
			System.out.println("국적 : " + address.getCountry());
			System.out.println("국적 : " + address.getCity());
			};
		
		System.out.println("[andThen]");
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", new Address("조선", "한양")));
	}
}
