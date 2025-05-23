package java001_basic;

public class Java012_operators {

	public static void main(String[] args) {
		
	//  true && true => true   && = and
	//  true && false => false
	//  false && true => false
	//  false && false => false
	// 
	//   true || true => true   || = or
	//   true || false => true
	//   false || true => true
	//   false || false => false
	//  
	//   !true => false    ! = not
	//   !false => true
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		
		res = x < y && x == z;
		System.out.println("res=" + res);
		
		res = x > y || x == z;
		System.out.println("res=" + res);
		
		//java에서는 논리연산자 양변에 무조건 논리값이 와야한다.
		//ex) res = 1 && x==z;


	}

}
