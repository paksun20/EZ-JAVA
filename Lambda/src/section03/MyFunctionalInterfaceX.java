/*
 * [���ٽ� �������̽�]
 * 1. �������̽�(interface)�� ����
 * 2. �߻�޼ҵ�� �� ���� ����
 * 3. @FunctionalInterface�� �ɼ�
 *    - �� �ɼ��� �����ϸ� �����Ϸ��� �޼ҵ��� ������ üũ
 *    - �޼ҵ尡 2�� �̻��̸� ����
 * 4. �޼ҵ带 �ϳ��� ������ �ִ� ��� �������̽��� ���ٽ����� ����� �� �ִ�. 
 */
package section03;

@FunctionalInterface
public interface MyFunctionalInterfaceX {
	public void method(int x);
}
