package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;

		
		for(int row = 0; row < data.length - 1; row++) {
			for(int col = 0; col < data[row].length - 1; col++) {
				data[row][col] = cnt;
				cnt++;
			}
		}
		
		for(int row = 0; row < data.length - 1; row++) {
			for(int col = 0; col < data[row].length - 1; col++) {
				data[row][3] = data[row][3] + data[row][col];
				data[3][col] = data[3][col] + data[row][col];
			}
			data[3][3] = data[3][3] + data[row][3];
		}
		
		
		
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				System.out.printf("data[%d][%d] = %d%s", row, col, data[row][col], col != data.length -1 ? '\t' : '\n');
			}
			
		}

	}// end main()

}// end class
