package java013_api;

import java.util.Scanner;

public class Java145_Scanner {

	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름:");
		
		String name = sc.nextLine();
		System.out.println(name);

	} // end main()

} // end class
