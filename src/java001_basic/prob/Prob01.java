package java001_basic.prob;

/*
 * num변수의 값이 10의 배수이면 1을 아니면 0을 
 * res변수에 리턴하는 프로그램을 구현하시오.
 * [실행결과]
 * res=0
 */
public class Prob01 {

	public static void main(String[] args) {
		int num = 10;
		int res;
		
		res = num % 10 == 0 ? 1 : 0;
		System.out.println("res=" + res);
		
	}

}
