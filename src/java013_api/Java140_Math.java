package java013_api;

import static java.lang.Math.E; // static을 써서 Math의 변수 import 가능
import static java.lang.Math.min;
import static java.lang.Math.*; // Math의 모든 멤버변수와 메소드를 import 한다.

//클래스에서 static 키워드가 선언된 멤버변수, 메소드 호출할때
//import static을 선언하면 클래스명 없이 멤버변수, 메소드를 호출할 수 있다.

public class Java140_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.max(10,20));
		System.out.println(E);
		System.out.println(min(10, 20));
		System.out.println(sqrt(25)); // 제곱근
		System.out.println(PI);
		System.out.println(pow(E,3)); // 거듭제곱

	} // end main()

} // end class
