package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 127; // -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 9223372036854775807L;  // L or l -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5f; // F or f(안붙이면 int 로 인식해서 에러)
		double dNum = 4.5;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";
		
		// 데이터를 출력하고 줄바꿈을 한다.
		System.out.println(bNum + "," + sNum);
		System.out.printf("%d,%d\n", bNum, sNum);
		
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값3...);
		 * 
		 * 출력기호
		 * %d : 정수(byte, short, int, long)
		 * %f : 실수 (float, double)
		 * %b : 논리 (boolean)
		 * %c : 문자 (char)
		 * %s : 문자열 (String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 */
		
		System.out.printf("%d %d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%5.1f %.1f\n", fNum, dNum); // %f = 소수점 6자리까지 %.1f = 소수점 1자리까지 %n = 전체 자리수
		System.out.printf("%c %b %s\n", cData, bNum, sData); 
		System.out.printf("%d %% %d=%d\n", 5, 2, 5%2); // % = 나머지  %%로 적어야 수식으로 인식됨
		
		System.out.printf("%o\n", 19); // %o = 8진수
		System.out.printf("%x\n", 19); // %x = 16진수
		System.out.printf("%s\n", Integer.toBinaryString(19)); // 2진수는 기호가 제공되지 않음 Integer를 이용해서 2진수 표현
		System.out.printf("%5x\n", 19); // 오른쪽 정렬
		System.out.printf("%-5x\n", 19); // 왼쪽 정렬 -
		System.out.printf("%05x\n", 19); // %0 = 빈칸을 0으로 채워줌
		
		System.out.print("java\n");
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");
		
		int nData = 0;
		while (nData<=5) {	
			System.out.println(nData);
			nData++;
		}
		
		
		
		
	} // end main()

} // end class
