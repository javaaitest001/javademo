package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok = money / 500;		
		int fiveHundred = 500;
		int hundred = 100;
		int fifty = 50;
		int ten = 10;
		int one = 1;
		
		int fiveHundredMok = money % fiveHundred == 0 ? money / fiveHundred : money / fiveHundred;
		money = money - (fiveHundred * fiveHundredMok);
		int hundredMok = money % hundred == 0 ? money / hundred : money / hundred;
		money = money - (hundred * hundredMok);
		int fiftyMok = money % fifty == 0 ? money / fifty : money / fifty;
		money = money - (fifty * fiftyMok);
		int tenMok = money % ten == 0 ? money / ten : money / ten;
		money = money - (ten * tenMok);
		int oneMok = money % one == 0 ? money / one : money / one;
		money = money - (one * oneMok);


		
		System.out.printf("500원 : %d개\n 100원 : %d개\n 50원 : %d개\n 10원 : %d개\n 1원 : %d개\n"
				, fiveHundredMok, hundredMok, fiftyMok, tenMok, oneMok);
				
	}//end main()

}//end class


