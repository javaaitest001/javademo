package java012_api.part04;

public class Address implements Cloneable{
	String city;
	String dong;
	
	public Address() {
	
	}

	public Address(String city, String dong) {
		this.city = city;
		this.dong = dong;
	}
	
	public Address clone() {
		Address address = null;
		
		try {
			Address cloneAddress = address.clone();
			address = (Address)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return address;
	} // end clone()
} // end class
