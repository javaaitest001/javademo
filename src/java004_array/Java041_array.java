package java004_array;

public class Java041_array {

	public static void main(String[] args) {

		int[] num = new int[] { 22, 3, 8, 12 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		System.out.printf("합계 = %d\n", sum);

		int avg = sum / num.length;
		System.out.printf("평균 = %d\n", avg);

		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		System.out.printf("배열 최대값 = %d\n", max);

	} // end main()

} // end class
