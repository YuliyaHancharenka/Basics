package javabasic.module8.factorial;

public class FactorialException extends Exception {

	private int number;

	public int getNumber() {
		return number;
	}

	public FactorialException(String message, int num) {
		super(message);
		number = num;
	}

}
