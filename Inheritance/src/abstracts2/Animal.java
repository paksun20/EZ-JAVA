/*
 * �߻� Ŭ������ new�� ����Ͽ� ��ü�� ������ �� ����.
 * �ݵ�� �߻� Ŭ������ ����� Ŭ������ ���� ��ü�� �����ؾ� �Ѵ�.
 */
package abstracts2;

/*
public class Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}
}
*/

public abstract class Animal {
	public String kind = "����";
	/*
	 * [�߻� �޼ҵ�]
	 * �߻� �޼ҵ�� ������ ������ ���� �ʴ�.
	 * ����� Ŭ�������� ������ �ؾ� �Ѵ�.
	 */
	public abstract void move();
	public abstract void sound();
	
	public void breathe() {
		System.out.println("������ ȣ���� �Ѵ�.");
	}
}


