package section11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortExample4 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };

		// ��������(ascending) ����
		System.out.println("�������� ���");
		Arrays.sort(scores);
		System.out.printf("Sorted Array : %s\n", Arrays.toString(scores));

		// ��������(ascending) ����
		System.out.println("�������� ���");
        // Integer[] scores2 = Arrays.stream(scores).boxed().toArray(Integer[]::new); 
		// Arrays.sort(scores, Collections.reverseOrder());
	  	System.out.println("�������� ���");
	  	System.out.println(Arrays.toString(scores));

	}
}

