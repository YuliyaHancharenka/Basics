package tam_cdp.preselection_tasks.part1.calculator;

public class Operation {

	static int x;
	
	public static int addition(int a, int b) {
		x = a + b;
		return x;
	}

	public static int subtraction(int a, int b) {
		x = a - b;
		return x;
	}

	public static int multiplication(int a, int b) {
		x = a * b;
		return x;
	}

	public static int division(int a, int b) {
		x = a / b;
		return x;
	}

}
