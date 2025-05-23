package java006_class.part06;

public class Java071_constructor {

	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		hp.name = "홍길동";
		hp.number = "010-1234-5678";
		hp.display();
		
		HandPhone hn = new HandPhone("김영희", "010-9876-5432");
		hn.display();

	} // end main()

} // end class
