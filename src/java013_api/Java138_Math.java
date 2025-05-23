package java013_api;

// Math 클래스의 모든 멤버변수, 메소드는 static에 선언되어 있다.
// Math.멤버변수
// Math.메소드()

public class Java138_Math {

	public static void main(String[] args) {
		// System.out.println(Math.E);
		// System.out.println(Math.PI); // 변수명 대문자 > final

		// 0.0이상 ~ 1.0미만
		// System.out.println(Math.random());

		double de = Math.random();
		System.out.println(de);

		de = de * 10;
		System.out.println(de);

		System.out.println(Math.floor(de));

		System.out.println((int) Math.floor(de)); // 0부터 9까지

		System.out.println((int) Math.floor(de) + 1); // 1부터 10까지

		System.out.println((int) Math.floor(Math.random() * 10) + 1);
	}

}
