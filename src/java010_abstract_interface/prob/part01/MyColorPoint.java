package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int a, int b, String color) {
		super(a, b);
		this.color = color;
	}
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void reverse() {
		int temp;
		temp = x;
		x = y;
		y = temp;
		
	}
	
	@Override
	protected void show() {
		// TODO Auto-generated method stub
		System.out.println(x + "," + y + "," + color);
	}
}
