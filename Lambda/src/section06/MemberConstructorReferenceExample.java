/*
 * [������ ����]
 * - ���ٽĿ��� ������ ����
 * - �����ڸ� �����ϸ� ��ü�� �����ϰ� ��
 * - Ŭ�����̸�::new
 */
package section06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MemberConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> func1 = Member::new;
		Member member1 = func1.apply("angel");
		System.out.println("member1: " + member1.getId());
		
		BiFunction<String, String, Member> func2 = Member::new;
		Member member2 = func2.apply("��λ�", "ȣ����");
		System.out.println("member2: " + member2.getName());
		System.out.println("member2: " + member2.getId());

		BiFunction<String, String, Member> func3 = (name, id) -> new Member(name, id);
		Member member3 = func3.apply("�Ѷ��", "����");
		System.out.println("member3: " + member3.getName());
		System.out.println("member3: " + member3.getId());
	}
}
