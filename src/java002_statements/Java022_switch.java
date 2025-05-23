package java002_statements;

// 30 : 4, 6, 9, 11
// 31 : 1, 3, 5, 7, 9, 10, 12
// 28 or 29 : 2

// 윤년 조건 
// 첫번째 조건 : 년도를 4로 나누어서 나머지가 0이고 년도를 100으로 나누어서 나머지가 0이 되면 안된다.
// 두번째 조건 : 년도를 400으로 나누어서 나머지가 0이면 된다.
// 두 개의 조건중에 하나 이상 만족하면 된다.
public class Java022_switch {

	public static void main(String[] args) {
		int year = 2024; // 년도
		int month = 2; // 월
		int lastDay; // 마지막일

		if (month < 1 || month > 12) {
			System.out.println("1월 ~ 12월까지만 가능합니다.");
			return; // 현재 수행 중인 메소드를 강제로 빠져나감
		}
		


		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;

		default:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				lastDay = 29;
			}else {
			lastDay = 28; break;
			}
		}

		System.out.printf("%d년도 %d월의 마지막은 %d일입니다.\n", year, month, lastDay);

	} // end main()

} // end class
