package javabasic.module8.exception;

public class Example1 {

	public static void main(String[] args) {

		int i = 0;
		int array[];
		array = new int[5];

		while (true) {
			try {
				array[i] = i;
			} catch (Exception ex) {

				System.out.println("\n" + ex.toString());
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
