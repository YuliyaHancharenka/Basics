package javabasic.module8.factorial;

public class Factorial {

	public static int getFactorial(int num) throws FactorialException {

		int result = 1;
		if (num < 1) {
			throw new FactorialException("Num can't be below 1", num);
		}

		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
