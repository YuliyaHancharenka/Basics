package javabasic.module3.cycles;

public class Main {

	
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n - i + 1; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
}
