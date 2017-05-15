package javabasic.module3.internetClub;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of computers: ");
		int compCount = scanner.nextInt();

		Computer compMain = new Computer("Main computer", true);

		Computer computers[];
		computers = new Computer[compCount];
		
		for (int i = 0; i < compCount; i++) {
			Computer compUser = new Computer("computerUser", false);
			computers[i] = compUser;
		}
		
		compMain.installComputers(computers);
				
		compMain.turnOnAllComp();
		}
}
