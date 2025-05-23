package java009_inheritance.part01;

//상속관계 (is a ~)
public class Child extends Father {

	public Child() {
	
	}
	
	void process() {
		System.out.println(a);
//		System.out.println(c); 상속 안됨 private
	}
	
} // end class
