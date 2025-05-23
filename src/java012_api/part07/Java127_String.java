package java012_api.part07;

//java.lang.String join() 과 java.util.StringJoiner

import java.util.StringJoiner;

public class Java127_String {

	public static void main(String[] args) {
		String color = "red,green,blue";
		String[] arr = color.split(",");
		String str = String.join("-", arr);
		System.out.println(str);
		System.out.println(color);
		
		StringJoiner sj = new StringJoiner(",","[" , "]");
		for(String data : arr)
			sj.add(data);
		
		System.out.println(sj);
		System.out.println(sj.length());

	} // end main()

} // end class
