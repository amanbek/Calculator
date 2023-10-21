package application;

public class Model {
	public long calculation (long num1, long num2, String operator) {
		switch (operator) {
			case "+":
				return num1 + num2;

			case "-":
				return num1 - num2;

			case "*":
				return num1 * num2;

			case "/":
				if (num2 == 0) {
					return 0;
				}
				return num1 / num2;
			default: System.out.println ("TEST");
		}
		System.out.println ("Unexpected value: " + operator);
		return 0;
	}
}
