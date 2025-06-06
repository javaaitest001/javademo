package java006_class.part01;

//변수 : 하나의 값을 저장하기 위한 메모리 공간
//int num = 3;
//char check='a';
//
//홍길동 90 80 70
//김영희 70 80 60
//배열 : 데이터 타입이 같은 데이터를 하나로 묶어 놓은 기능
//int[][] arr= {{90, 80, 70}, {70, 80, 60}};
//String[] name ={"홍길동","김영희"};
//
//int, short, long, float
//int num = 3;
//구조체 : 서로 관련이 있는 데이터를 하나로 묶어놓은 기능
// <구조체 정의>
// typeof struct person{
//   char name[10];
//   int ko;
//   int en;
//   int ma;
//   boolean gender;
// }
// 
// <구조체 선언>
// person ps;
// ps.name={'h','o','n','g'};
// ps.ko=90;
// ps.en=80;
// ps.ma=70;
// ps.gender=true;
// 
// 
// person pn;
// pn.name={'k','i','m'};
// pn.ko=70;
// pn.en=80;
// pn.ma=60;
// pn.gender=false;
// =============================================================
// 
// 객체 : 실세계에 존재하는 모든 사물이나 개념들이다.
//       실세계(자동차, 모니터, 책)  개념(수강,추리)
// 
// 객체 모델링: 객체의 속성(필드)과 동작(메소드)을 구분한다. (객체를 프로그램으로 구현하기 위한 분석작업이다.)
// 
// 홍길동
// 객체의 속성(특징) : 이름(홍길동), 나이(30), 성별(남)
// 객체의 동작 (기능): 개발한다. 달린다.
// 
// 김영희
// 객체의 속성(특징) : 이름(김영희), 나이(28), 성별(여)
// 객체의 동작(기능) : 개발한다. 달린다.
// 
// 클래스(class) : 구조체(멤버변수) + 함수(메소드)
//               => 객체의 공통점을 찾아내어 그 공통점을 표현한 것, 객체의 설계도이다.
//               
// 
// <클래스 정의>
// class Person{
//    String name;
//    int age;
//    char gender;
//    
//    Person(){ }     
//    
//    void develop(){
//      System.out.println("개발한다");
//    }
//    
//    void run(){
//     System.out.println("달린다");
//    }
// }
// 
// <객체참조변수 선언>
// Person ps;
//
// <객체 생성>
// ps = new Person( );  
// ps.name = "홍길동";
// ps.age = 30;
// ps.gender = '남';
// ps.develop( );
// ps.run( );
// 
// 
// <객체참조변수 선언>
// Person pn;
// 
// <객체 생성>
// pn = new Person( );
// pn.name="김영희";
// pn.age = 28;
// pn.gender='여';
// pn.develop();
// pn.run( );
// 
// 
// JVM 메모리 구조
// 1. method area : 클래스의 정보, 메소드 바이트 코드, 클래스 변수, 상수
// 2. stack area : 지역변수, 매개변수
// 3. heap area : 클래스, 배열, enum
// 
// 
// 
// 자바 프로그램의 특징
// 1. 플랫폼에 독립적이다.
// 2. 자동으로 메모리 관리를 한다.(가비지 컬렉션에서 관리)
// 3. 네트워크와 분산환경을 지원한다.
// 4. 멀티스레드를 지원한다.
// 
// 
// SmartPhone - 프로세스
// 전화통화 -스레드
// SNS - 스레드
// 게임-스레드
// 음악-스레드
 
public class Java066_class {

	public static void main(String[] args) {
		
		Person pn; // 객체참조변수 선언
		pn = new Person(); // 객체생성
		
		//객체참조변수.멤버변수
		pn.name = "홍길동";
		pn.age = 30;
		pn.gender = '남';
		
		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender);
		
		//객체참조변수.메소드
		pn.develop();
		pn.run();
		
		Person ps = new Person(); // 객체참조변수 선언 및 생성
		ps.name = "김영희";
		ps.age = 28;
		ps.gender = '여';
		
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		
		ps.develop();
		ps.run();
		
		
	} // end main()

} // end class
