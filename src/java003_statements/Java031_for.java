package java003_statements;

/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */



public class Java031_for {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i % 3 != 0) {
				System.out.printf("%d\n", i);
			}
		}

		
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j > i)
					continue;
				else if(j == 1)
					System.out.printf("%d", j);
				else 
					System.out.printf("%4d", j);
			}
			System.out.println();
		}
		

	} // end main()

} // end class
