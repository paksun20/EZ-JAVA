
import java.util.Arrays;
import java.util.Collections;

public class SortRun {
	public static void main(String[] args) {
		Integer[] scores = { 99, 97, 98, 77, 60 };   // ��������(ascending) ����

		
		Arrays.sort(scores);
		System.out.println("�������� ���");
		
		System.out.println(Arrays.toString(scores));
		
	  	System.out.println("\n");
	  	
	  	Arrays.sort(scores,Collections.reverseOrder());
	  	System.out.println("�������� ���");
	  	System.out.println(Arrays.toString(scores));
	}
}