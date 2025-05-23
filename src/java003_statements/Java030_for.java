package java003_statements;

//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
//

public class Java030_for {

	public static void main(String[] args) {
		int odd = 0; // 홀수 누적
		int even = 0; // 짝수 누적
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				even = even + i;
			}else {
				odd = odd + i;
			}
		}
		
		System.out.printf("홀수누적 : %d\n 짝수누적 : %d\n", odd, even);

	} // end main()

} // end class
