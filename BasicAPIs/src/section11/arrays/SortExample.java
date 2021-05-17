/*
 * ����(Sort)
 * - ��������: ���� ������ ū ������ ����
 * - ��������: ū ������ ���� ������ ����
 */
package section11.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };
		
		Arrays.sort(scores); // ��������(ascending)
		
		System.out.println("[��������(ascending)]");
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
		
		System.out.println("[��������(descending)]");
		for(int i = scores.length - 1; i >= 0; i--) { // ��������(descending)
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}

	}

}
