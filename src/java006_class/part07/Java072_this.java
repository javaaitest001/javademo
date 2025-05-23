package java006_class.part07;

public class Java072_this {

	public static void main(String[] args) {
		Product pt = new Product("s001", "물품", 4000);
		pt.process();
		
		Product pd = new Product();
		pd.process();

	} // end main()

} // end class
