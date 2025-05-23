package java004_array;

//[출력결과]

//1  2  3  4  5
//10 9  8  7  6    6 7 8 9 10
//11 12 13 14 15
//20 19 18 17 16

public class Java050_array {

	public static void main(String[] args) {

		int[][] data = new int[4][5];
		int cnt = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = cnt;
				cnt++;
			}
		}
		// 값으로 접근
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (i % 2 == 1)
					System.out.printf("%4d",
							data[i][data[i].length - data[i].length] + data[i][data[i].length - 1] - data[i][j]);
				else
					System.out.printf("%4d", data[i][j]);
			}
			System.out.println();
		}
		
		//인덱스로 접근
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (i % 2 == 1)
					System.out.printf("%4d", data[i][data[i].length - 1 - j]);
				else
					System.out.printf("%4d", data[i][j]);
			}
			System.out.println();
		}

	}

}
