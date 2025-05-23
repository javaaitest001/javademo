package java013_api;

//이름, 학점을 입력하는 프로그램을 구현하시오.
//입력 : 홍길동,80,93
//
//[출력결과]
//이름: 홍길동
//국어: 80
//영어: 93
//평균: 86.5 (double로 계산)

import java.util.Scanner;

public class Java153_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.nextLine();

		String[] data = input.split(",");
		System.out.printf("이름: %s\n국어: %s\n영어: %s\n", data[0], data[1], data[2]);
		double avg = avg(data);
		System.out.println("평균: " + avg);
	} // end main()

	public static double avg(String[] data) {
		double avg =(Double.parseDouble(data[1]) + Double.parseDouble(data[2])) / 2;

		return avg;
	} // end avg()
	
} // end class
