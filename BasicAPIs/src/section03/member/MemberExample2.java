package section03.member;

public class MemberExample2 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2) || obj1.equals(obj3)) {
			if(obj1.equals(obj2)) {
				System.out.println("obj1�� obj2�� ���� ��(id)�� ������ �ִ�.");
			}
			
			if(obj1.equals(obj3)) {
				System.out.println("obj1�� obj3�� ���� ��(id)�� ������ �ִ�.");
			}
		}
		else {
			if(obj1.equals(obj2) != true){
				System.out.println("obj1�� obj2�� ���� ��(id)�� ������ ���� �ʴ�.");
			}

			if(obj1.equals(obj3) != true){
				System.out.println("obj1�� obj3�� ���� ��(id)�� ������ ���� �ʴ�.");
			}
		}
		
	}
}
