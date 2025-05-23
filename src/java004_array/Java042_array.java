package java004_array;

public class Java042_array {

	public static void main(String[] args) {

		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수 누적
		int even = 0; // 짝수 누적

		
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				even = even + num[i];
			else
				odd = odd + num[i];
		}
		
		for(int i : num) {
			System.out.println(i);
		}

		System.out.printf("짝수 합 = %d\n", even);
		System.out.printf("홀수 합 = %d\n", odd);

	}

}
