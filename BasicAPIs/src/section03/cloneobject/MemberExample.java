package section03.cloneobject;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "����", "12345", 25, true);
		
		Member cloned = original.getMember();
		
		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);
		
		cloned.password = "54321";

		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);
	}

}
