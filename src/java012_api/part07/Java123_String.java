package java012_api.part07;

//[출력결과]
// korea
// aerok
// korea

public class Java123_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = reverse(sn);
		System.out.println(sn);
		System.out.println(data);
		System.out.println(sn);

	} // end main()

	public static char[] reverse(String alps) {
		// alps매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램 구현
		char[] data = new char[alps.length()]; 
		for(int i = 0; i < data.length; i++) {
				data[i] = alps.charAt(alps.length()-1-i); 
		}
		
		return data;
	}
	
} // end class
