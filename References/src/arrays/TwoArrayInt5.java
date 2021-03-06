package arrays;
/*
 * 2차원 배열
 * 2차원 배열의 내용을 1차원 배열로 복사
 * 조건: arraycopy를 쓰지 않고 복사 
 */
public class TwoArrayInt5 {

	public static void main(String[] args) {
		int[][] td = new int[][]{ {11,12}, {21,22}, {31,32} };
		
		for(int row=0; row < td.length; row++) {
			for(int col=0; col < td[row].length; col++) {
				System.out.printf("td[%d][%d]=[%d]\n", row, col, td[row][col]);
				
			}
		}

		System.out.println("행의 크기: td.length=" + td.length);
		int[] tx = new int[td.length * 2];
		for(int row = 0; row < td.length; row++) {
			for(int col=0; col < td[row].length; col++) {
				tx[row + col + row] = td[row][col];
				// System.out.println((row + col + row));
			}
		}
		
		for(int x : tx) {
			System.out.printf("[%d] ", x);
		}
		
		System.out.println();
	}
}
