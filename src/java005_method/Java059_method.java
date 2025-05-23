package java005_method;

public class Java059_method {

	public static void main(String[] args) {
		
		// 조건 : data변수에 소문자만 입력
				char data = 'd';
				char code = process(data);
				System.out.printf("%c의 대문자는 %c입니다.\n", data, code);
			}// end main()
			public static char process(char data) {
				// data매개변수의 값을 대문자로 변경해서 리턴
				
				
				return (char)(data-32);
	} // end process()

} // end class
