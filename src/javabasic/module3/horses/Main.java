package javabasic.module3.horses;

public class Main {
	public static void main(String[] args) {
	Sorrel sorrel1 = new Sorrel();
	Sorrel sorrel2 = new Sorrel();
	
	sorrel1.result = 1;
	sorrel2.result = 2;
	
	sorrel1.owner = "Petrov";
	sorrel2.owner = "Ivanov";
	
	System.out.println("For sorrel " + sorrel1.owner + " result is "  + sorrel1.result);
	System.out.println("For sorrel " + sorrel2.owner + " result is "  + sorrel2.result);
	}
}
