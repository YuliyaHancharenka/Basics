package tam_cdp.preselection_tasks.part1.calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculation {

	private static int calculate(int a, int b, char z) {
		int result = 0;
		switch (z) {
		case '+':
			result = Operation.addition(a, b);
			break;
		case '-':
			result = Operation.subtraction(a, b);
			break;
		case '*':
			result = Operation.multiplication(a, b);
			break;
		case '/':
			if (b == 0) {
				throw new ArithmeticException(
						"Null devision exception!\nYou can not divide by zero!");
			} else {
				result = Operation.division(a, b);
			}
			break;
		}
		return result;
	}

	private static char getChar(String st) {
		char sign = 0;
		if (st.indexOf(42) != -1) {
			sign = '*';
		} else if (st.indexOf(43) != -1) {
			sign = '+';
		} else if (st.indexOf(45) != -1) {
			sign = '-';
		} else if (st.indexOf(47) != -1) {
			sign = '/';
		} else {
			System.out.println("Wrong!!");
		}
		return sign;
	}

	public static int execute(Scanner scanner, Pattern pattern) {
		String expression = scanner.next(pattern);
		String[] todo = expression.split("[*+-/]");
		int foo = Integer.parseInt(todo[0]);
		int bar = Integer.parseInt(todo[1]);
		char ch = getChar(expression);
		int result = Calculation.calculate(foo, bar, ch);
		return result;
	}
}
