package java004_array;

//[출력결과]
//1  *  3  *  5
//6  *  8  * 10
//11 * 13  * 15
//16 * 18  * 20

public class Java051_array {

	public static void main(String[] args) {
		
		int[][] data = new int[4][5];
		int cnt = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = cnt;
				cnt++;
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j % 2 == 1)
					System.out.printf("%4c", '*');
				else
					System.out.printf("%4d", data[i][j]);
			}
			System.out.println();
		}

	} // end main()

} // end class
