package java006_class.prob.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Area pizza = new Area();
		pizza.menuName = "자바피자";
		pizza.radius = 10;
		
		pizza.display();
		
		Area donut = new Area();
		donut.menuName = "자바도넛";
		donut.radius = 2;
		
		donut.display();
	}//end main()

}//end class
