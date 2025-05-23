package java018_collection.part16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java203_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
//		Arrays.sort(arr);
//		
//		for(Integer data : arr)
//			System.out.println(data);
		
		List<Integer> ast = Arrays.asList(arr);
		System.out.println(ast.toString());
		
		ast.sort(new Ascending());
		System.out.println(ast.toString());
		
		ast.sort(new Decending());
		System.out.println(ast.toString());
		

	} // end main()

} // end class
