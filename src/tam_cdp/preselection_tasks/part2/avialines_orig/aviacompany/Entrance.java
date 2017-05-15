package tam_cdp.preselection_tasks.part2.avialines_orig.aviacompany;

import java.util.Scanner;

public class Entrance {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Airline Help Desk!");

		HelpDesk.welcomeHelp();

		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNext("exit")) {
			if (scanner.hasNext("1")) {
				HelpDesk.giveReference(scanner);
			} else if (scanner.hasNext("2")) {
				HelpDesk.searchPlane(scanner);
			} else {
				System.out.println("No such an option!");
				HelpDesk.welcomeHelp();
				scanner.nextLine();
			}
		}
		System.out.print("\nBye-Bye!");
		scanner.close();
	}
}
