package section11.arrays;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("��ȫ��");
		Member m3 = new Member("�̼���");
		Member m4 = new Member("������");
		
		Member[] members = { m1, m2, m3, m4 };
		Arrays.sort(members);
		
		for(int i = 0; i < members.length; i++) {
			System.out.printf("Members[%d]=%s\n", i, members[i].name);
		}
	}
}
