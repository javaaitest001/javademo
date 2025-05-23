package java003_statements;

// 1 2 3 4
// 5 6 7 8
// 9 10 11 12

public class Java032_for {

	public static void main(String[] args) {

		for (int j = 1; j <= 12; j++) {
			System.out.printf("%d ", j);
			if (j % 4 == 0) {
				System.out.println();
			}
		}
		
		int data = 1;
		
		for(int row = 1; row <=3; row++) {
			for(int col = 1; col <= 4; col++) {
				if(col == 1) {
					System.out.printf("%d", data++);
				}else {
					System.out.printf("%4d", data++);
				}
				
			}
			System.out.println();
		}
		
	}

}
