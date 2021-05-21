/*
 * ���ʸ��� Ŭ���� ������ �� Classname<T>�� ǥ���Ѵ�.
 *   - <T> ������ Ÿ���� �� �� �ִٴ� �ǹ�
 *   
 * ���ʸ��� Ŭ������ ������ �� Ÿ���� ��������� �����Ͽ� Ÿ���� �����Ѵ�.
 *   - Classname<Type> = new Classname<Type>
 */
package section04;

public class Box<T> {  // T = (int | float | double | String | Class | Object | ...)
	private T name;    // private String name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
}
