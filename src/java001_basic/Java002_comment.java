package java001_basic;

public class Java002_comment {
	
	public static void main(String[] args) { // main Ctrl+Space
		// Ctrl + /  설정/해체
//		한 라인 주석
		
		/*
			여러라인 주석처리 Ctrl + Shift + / 설정
			Ctrl + Shift + \  해제
			단축키가 안된다면 /*로 수동 입력 가능  
		*/
		
		int a = 2;  // 변수 선언
		System.out.println("hello"+a);
		System.out.println(a);
		
		process(); // process 선언  > 정의의 위치는 class 어디에 있든 상관없음
	}  //end main()
	
	public static void process() {
		System.out.println("process method");
	} // end process()
	
} // end class
