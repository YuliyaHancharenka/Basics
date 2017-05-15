package javabasic.module3.gamers;
 
public class Main {
	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		Gamer gamer2 = new Gamer();
		
		gamer1.level = 1;
		gamer2.level = 3;
		
		System.out.println("Gamer1 level = " + gamer1.level);
		System.out.println("Gamer2 level = " + gamer2.level);
		
		gamer1 = gamer2;

		System.out.println("Gamer1 level = " + gamer1.level);
		System.out.println("Gamer2 level = " + gamer2.level);
		
		gamer1.level = 1;
		
		System.out.println("Gamer1 level = " + gamer1.level);
		System.out.println("Gamer2 level = " + gamer2.level);
		
	}
}
