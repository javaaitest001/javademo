package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		// 2차원 배열

		// 3행 2열의 2차원 배열, 3차원이면 [] 3개
		int[][] num = new int[3][2];

		/*
		 * System.out.printf("num[%d][%d]=%d\t", 0 , 0, num[0][0]);
		 * System.out.printf("num[%d][%d]=%d\n", 0 , 1, num[0][1]);
		 */

		// System.out.println(num.length);

		// num.length : 2차원에서는 배열의 행의 크기
		// num[row].length : 열의 크기

		/*
		 * for (int row = 0; row < num.length; row++) { for (int col = 0; col <
		 * num[row].length; col++) { if (col == 0) System.out.printf("num[%d][%d]=%d\t",
		 * row, col, num[row][col]); else System.out.printf("num[%d][%d]=%d\n", row,
		 * col, num[row][col]); } }
		 */

		int data = 1;
		
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				num[row][col] = data;
				data++;
				/*
				 * if (col == 0) System.out.printf("num[%d][%d]=%d\t", row, col, num[row][col]);
				 * else System.out.printf("num[%d][%d]=%d\n", row, col, num[row][col]);
				 */
			}

		}
		System.out.println("=====================================");
		
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", col != num[row].length - 1 ? '\t' : '\n'); // 2 문장을 합쳐도 된다. 대신 가독성 떨어짐
			}
		}

	}

}
