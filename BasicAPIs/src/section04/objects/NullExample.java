/*
 * Objects.requireNonNull(T obj)
 * - null�� �ƴϸ� �Ķ���ͷ� ���޵� ���� ����
 * - null�̸� NullPointerException ���ܰ� �߻��ϹǷ� null�̸� �ݵ�� ����ó���� �ؾ� �Ѵ�.
 * - null�̸� �⺻��(default)���� ������ ���� ����
 */
package section04.objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = null;
		
		System.out.println("isNull(s1): " + Objects.isNull(s1)); // false
		System.out.println("isNull(s2): " + Objects.isNull(s2)); // true

		System.out.println("nonNull(s1): " + Objects.nonNull(s1)); // true
		System.out.println("nonNull(s2): " + Objects.nonNull(s2)); // false
		
		System.out.println("s1: " + Objects.requireNonNull(s1));
		
		// System.out.println("s2: " + Objects.requireNonNull(s2, "��"));
		
		try {
			System.out.println("s2: " + Objects.requireNonNull(s2));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("s2: " + Objects.requireNonNull(s2, "�⺻��"));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
