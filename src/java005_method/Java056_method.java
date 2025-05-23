package java005_method;

public class Java056_method {

	public static void main(String[] args) {

		int year = 2025; // 년도

		boolean chk = isLeapYear(year);
		display(year, chk);
	} // end main()

	public static void display(int year, boolean chk) {
		if (chk)
			System.out.printf("%d년도는 윤년입니다.\n", year);
		else
			System.out.printf("%d년도는 평년입니다.\n", year);
	} // end display()

	public static boolean isLeapYear(int year) {
		// 년도가 윤년이면 true, 평년이면 false로 리턴하는 프로그램 구현
//		boolean res;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//			res = true;
			return true;
		else
//			res = false;
			return false;

//		return res;
	} // end isLeapYear()

} // end class
