package java004_array;

public class Java040_array {

	public static void main(String[] args) {

		// 초기값을 할당하면서 배열을 생성할 때는 배열의 크기를 지정할 수 없다.
		int[] arr = new int[] { 90, 80, 40 };

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

		int[] data = { 90, 80, 40 };
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}

		/*
		 * for (int i = 1; i <= 5; i++) { for (int k = 1; k <= 5 - i; k++) {
		 * System.out.printf(" "); }
		 * 
		 * for (int j = 1; j <= 5; j++) {
		 * 
		 * if (j <= i) System.out.printf("*"); } System.out.println(); }
		 */

	} // end main()

} // end class
