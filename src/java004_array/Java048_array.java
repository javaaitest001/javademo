package java004_array;

//

//  1  2  3  4  5
//  6  7  8  9  10
//  11 12 13 14 15
//  16 17 18 19 20
//  
//  num배열에서 아래와 같이 출력이 되도록 구현
//  [출력결과]
//  1  2  *  4  5
//  *  7  8  *  10
//  11 * 13 14  *
//  16 17 * 19 20
//  
// 

public class Java048_array {

	public static void main(String[] args) {

		int[][] data = new int[4][5];
		int cnt = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = cnt;
				cnt++;
			}
		}

		/*
		 * for (int i = 0; i < data.length; i++) { for (int j = 0; j < data[i].length;
		 * j++) { if (data[i][j] % 3 == 0) data[i][j] = '*'; } }
		 */

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] % 3 == 0)
					System.out.printf("%4c", '*');
				else
					System.out.printf("%4d", data[i][j]);
			}
			System.out.println();
		}
	} // end main()

} // end class
