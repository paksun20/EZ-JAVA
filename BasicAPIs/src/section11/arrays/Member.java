package section11.arrays;

public class Member implements Comparable<Member> {
	String name;
	
	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member member) { // �������� ����
		return name.compareTo(member.name);
	}

	/*
	@Override
	public int compareTo(Member member) { // �������� ����
		return name.compareTo(member.name) * -1;
	}
	*/

}
