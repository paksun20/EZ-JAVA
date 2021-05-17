package section03.cloneobject;

public class MemberExample2 {

	public static void main(String[] args) {
		Member original = new Member("blue", "����", "12345", 25, true);
		
		Member cloned = original.cloneMember();
		
		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);

		System.out.println("[����] �н�����:54321");
		cloned.password = "54321";

		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);
	}

}
