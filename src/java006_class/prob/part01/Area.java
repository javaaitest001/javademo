package java006_class.prob.part01;

public class Area {
	int radius;
	String menuName;
	
	double areaCal() {
		return radius * radius * 3.14;
	}
	
	void display() {
		System.out.printf("%s의 면적은 %.2f입니다.\n", menuName, areaCal());
	}
}
