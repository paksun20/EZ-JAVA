package section11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortExample5 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };

		// ��������(ascending) ����
		System.out.println("�������� ���");
		Arrays.sort(scores);
		System.out.printf("Sorted Array : %s\n", Arrays.toString(scores));

		// ��������(ascending) ����
		System.out.println("�������� ���");

		/*
		for (int b : scores, Collections.reverseOrder()) {
            System.out.printf(b+"%n");
		*/
	}
}

