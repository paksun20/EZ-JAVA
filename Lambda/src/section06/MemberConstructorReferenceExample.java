package section06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MemberConstructorReferenceExample {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		Function<String, Member> func1 = Member :: new;
		Member member1 = func1.apply("angel");
		System.out.println("angel : " + member1.getId());
		
		BiFunction<String, String, Member> func2 = Member :: new;
		Member member2 = func2.apply("신천사", "angel");
		System.out.println("member2 : " + member2.getName());
		System.out.println("member2 : " + member2.getId());
		System.out.println("-------------------------------");
		
		BiFunction<String, String, Member> func3 = (name, id) -> new Member(name, id);
		Member member3 = func3.apply("한라산", "고라니");
		System.out.println("member3 : " + member3.getName());
		System.out.println("member3 : " + member3.getId());
		System.out.println("-------------------------------");
	}
}
