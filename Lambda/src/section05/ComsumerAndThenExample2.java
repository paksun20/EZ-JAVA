package section05;

import java.util.function.Consumer;

public class ComsumerAndThenExample2 {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA(�̸�)");
			System.out.println("> �ѱ��̸�:" + m.getName());
			System.out.println("> �� �� ��:" + m.getId());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB(�ּ�)");
			Address address = m.getAddress();
			System.out.println("> ���� : " + address.getCountry());
			System.out.println("> ���� : " + address.getCity());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "HongGilDong", new Address("����", "�Ѿ�")));
	}

}
