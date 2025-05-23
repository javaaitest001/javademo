package java012_api.part07;

public class Java122_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8000";

		int index = sn.indexOf(":");
		System.out.println("ip:" + sn.substring(0, index));
		System.out.println("port:" + sn.substring(index + 1));
		
		System.out.println("=======================");
		String[] arr = sn.split(":");
		System.out.printf("ip:%s\nport:%s\n", arr[0], arr[1]);

	}

}
