package java003_statements.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 *  *평년,윤년을 구하는 프로그램을 구현하시오.
 * 1 윤년의 조건
 *  1) 년도를 4로 나눈 나머지가 0이고 100로 나눈 나머지가 0이 아니다.
 *  2) 년도를 400로 나눈 나머지가 0이다.
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) {
		int year = 2001;
		
		for(int i = 0 ; i <= 11 ; i++) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year);
				
			}
			year++;
		}
      
       
	}//end main()

}//end class













