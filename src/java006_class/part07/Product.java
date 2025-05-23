package java006_class.part07;

//this : 메모리에 생성된 객체 자신을 의미한다.
//1. this.멤버변수
//2. this.메소드()
//3. this( ) :생성자

public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		this("b001", "식품", 2000);
	}
	
	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	
	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
	
	void process() {
		this.display(); // this 생략 가능
	}
}
