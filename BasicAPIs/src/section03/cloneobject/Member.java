/*
 * [���� ����]
 * ��ü�� �����ϱ� ���ؼ��� Cloneable �������̽��� ���� Ŭ������ �����ؾ� �Ѵ�.
 * - ������ ��ü�� ���۷�Ʈ �ּҸ� ����
 * - Object.clone()�� ���
 * - CloneNotSupportedException ���ܸ� ó��
 */

package section03.cloneobject;

public class Member implements Cloneable {
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member cloneMember() {
		Member clonedMember = new Member(id, name, password, age, adult);
		return clonedMember;
	}
	
	public Member getMember() {
		Member clonedMember = null;
		
		try {
			clonedMember = (Member)clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Member Object is not supported");
		}
		return clonedMember;
	}
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	

}
