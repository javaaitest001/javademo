package java004_array;

public class Java046_array {

	public static void main(String[] args) {
		// 3행 2열의 배열
		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d] = %d%c", row, col, num[row][col],
						col != num[row].length - 1 ? '\t' : '\n');
			}
		}

		System.out.println("================================");
		// 처음 row를 선언해서 length 를 사용할 경우 초기식에 선언 및 증감식에 초기화 시켜주기.
		// row를 선언했기 때문에 이중 for문에서는 선언하지 않아도 된다. 대신 ; 은 꼭 들어가야된다.
		for (int col = 0, row = 0; col < num[row].length; col++, row = 0) {
			for (; row < num.length; row++) {
				System.out.printf("num[%d][%d] = %d%c", row, col, num[row][col], row != num.length - 1 ? '\t' : '\n');
			}
		}
	}
}
