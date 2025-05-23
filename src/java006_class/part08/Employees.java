package java006_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
		
	}
	
	//매개변수의 타입과 갯수를 가지고 구분을 하므로 String타입이 1개인 생성자가 2개이면 안된다.
	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
				
	}
	
	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d", name, dept, salary);
	}

}
