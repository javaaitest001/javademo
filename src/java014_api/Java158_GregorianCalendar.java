package java014_api;

import java.util.GregorianCalendar;

public class Java158_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2024;
		
		GregorianCalendar gre = new GregorianCalendar();
		String chk = gre.isLeapYear(year) ? "윤년" : "평년";
		System.out.println(chk);
		

	} // end main()

} // end class
