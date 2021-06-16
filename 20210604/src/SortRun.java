
import java.util.Arrays;
import java.util.Collections;

public class SortRun {
	public static void main(String[] args) {
		Integer[] scores = { 99, 97, 98, 77, 60 };   // 오름차순(ascending) 정렬

		
		Arrays.sort(scores);
		System.out.println("오름차순 출력");
		
		System.out.println(Arrays.toString(scores));
		
	  	System.out.println("\n");
	  	
	  	Arrays.sort(scores,Collections.reverseOrder());
	  	System.out.println("내림차순 출력");
	  	System.out.println(Arrays.toString(scores));
	}
}