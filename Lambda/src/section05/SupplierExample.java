/*
 * [Supplier �Լ��� �������̽�]
 * - ���ϰ��� �ִ� �޼ҵ带 ������ �ִ� �Լ��� �������̽�
 * @FunctionalInterface
 * public interface IntSupplier {
 *     int getAsInt();
 * }
 */
package section05;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier supplier = () -> {
			int num = (int)(Math.random() * 6 + 1);
			return num;
		};

		for(int x = 0; x < 6; x++) {
			int num = supplier.getAsInt();
			System.out.println("���� ��: " + num);
		}
	}

}
