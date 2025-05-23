package java012_api.part07;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");

		System.out.println("문자열 길이:" + str.length()); // 14
		System.out.println("대문자:" + str.toUpperCase()); // KOREA,JSP,JAVA
		System.out.println("소문자:" + str.toLowerCase()); // korea,jsp,java
		System.out.println("문자:" + str.charAt(0)); // K
		System.out.println("인덱스:" + str.indexOf(97)); // 4
		System.out.println("인덱스:" + str.indexOf('a', 5)); // 11
		System.out.println("범위:" + str.substring(5));
		System.out.println("범위:" + str.substring(2, 5));

		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}

		int x = 10;
		int y = 20;

		System.out.printf("x=%d, y=%d, x+y=%d\n", x, y, x + y);
		
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1+s2);
		
		char[] data = {'1','2','3','4','5'};
		String s3 = String.valueOf(data);
		System.out.printf("s3=%s\n", s3);
		
		String s4 = String.valueOf(data, 2, 3); // 2번 인덱스부터 3개
		System.out.printf("s4=%s\n", s4);
	} // end main()
} // end class
