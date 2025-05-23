package java012_api.part03;

public class Java117_Object_hashCode {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		//hashCode()메소드는 16진수 값을 10진수로 리턴해주는 값이다.
		System.out.println(p1.hashCode());
		
		////////////////////////////////////
		System.out.println(System.identityHashCode(p2));

	} // end main()

} // end class
