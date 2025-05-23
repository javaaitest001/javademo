package java010_abstract_interface.part06;

//클래스명 : User
//-name:String
//+User()
//+User(name:String)
//+toString():String

public class User {
	private String name;
	
	public User() {
	
	}
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
