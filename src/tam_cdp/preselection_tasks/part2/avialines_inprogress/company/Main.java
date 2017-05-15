package tam_cdp.preselection_tasks.part2.avialines_inprogress.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Best Impressions Help Desk!");

		HelpDesk.indexPage();

		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNext("exit")) {
			if (scanner.hasNext("1")) {
				HelpDesk.giveReference(scanner);
			} else if (scanner.hasNext("2")) {
				HelpDesk.searchTour(scanner);
			} else {
				System.out.println("No such an option!");
				HelpDesk.indexPage();
				scanner.nextLine();
			}
		}
		System.out.print("\nGood luck!");
		scanner.close();
	}
}
