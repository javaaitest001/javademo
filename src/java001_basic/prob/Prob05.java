package java001_basic.prob;
/*
 * ko, en, jp 평균을 구해서 60점 이상이면 "합격", 60점 미만이면 "불합격"을 
 * 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 1) 합격일때
 * 평균  65.0점, 합격입니다
 * 
 * 2)불합격일때
 * 평균  34.5점, 불합격입니다
 */

public class Prob05 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45;
		int jp = 22;
		int hap = ko + en + jp;
		int avg = (ko + en + jp) / 3;

		String avgName = avg >= 60 ? "합격" : "불합격";
		System.out.printf("평균 %d점, %s입니다.", avg, avgName);
		
		
        
	}//end main()

}//end class





