package java004_array;

public class Java049_array {

	public static void main(String[] args) {
		
		int[][] data = new int[4][5];
		int cnt = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = cnt;
				cnt++;
			}
		}
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(i % 2 == 1) 
					System.out.printf("%4c", '-');
				else 
					System.out.printf("%4d", data[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	} // end main()

} // end class
