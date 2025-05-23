package java013_api;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {

	public static void main(String[] args) {
		int[] num = new int[5];

		Random ran = new Random();
		
		
		for (int i = 0; i < num.length; i++) {
			//num[i] = ran.nextInt(10) +1;
			
			//num[i] = (((int) Math.floor(Math.random() * 100)) % 45) + 1;
			num[i] = ran.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(num);
		for (int data : num) {
			System.out.printf("%4d", data);
		}

	} // end main()

} // end class
