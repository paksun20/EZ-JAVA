package section05;

import java.util.function.Consumer;

public class ComsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA:" + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB:" + m.getId());
		};
		
		System.out.println("[����ó��]");
		Member member = new Member("ȫ�浿", "HongGilDong", null);
		consumerA.accept(member);
		consumerB.accept(member);

		System.out.println("[andThen]");
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "HongGilDong", null)); 
	}

}
