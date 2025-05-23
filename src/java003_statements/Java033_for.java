package java003_statements;

/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

public class Java033_for {

	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j == 1)
					System.out.printf("%d", num++);
				else
					System.out.printf("%4d", num++);
			}
			System.out.println();
			num = 1;
		}
		
	} // end main()

} // end class


