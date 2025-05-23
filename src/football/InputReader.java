package football;

import java.util.Scanner;

public class InputReader {

	private Scanner scanner = new Scanner(System.in);

	public InputReader() {

	}

	public int inputNum() {
		while (true) {
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				return Integer.parseInt(input);
			} else {
				System.out.println("숫자를 입력하세요!");
			}
		}
	} // end inputNum()

	public int inputNum(String message) {
		System.out.println(message);
		while (true) {
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				return Integer.parseInt(input);
			} else {
				System.out.println("숫자를 입력하세요!");
			}
		}
	} // end inputNum()

	public String inputMessage(String message) {
		System.out.println(message);
		return scanner.nextLine();
	} // end inputMessage()

} // end class
