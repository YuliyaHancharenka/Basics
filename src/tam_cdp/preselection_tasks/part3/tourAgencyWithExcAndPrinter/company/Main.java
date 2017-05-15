package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.exceptions.NoOptionException;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.Logger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Best Impressions Help Desk!");

		Consulting.indexPage();

		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNext("exit")) {
			if (scanner.hasNext("1")) {
				Consulting.giveReference(scanner);
			} else if (scanner.hasNext("2")) {
				try {
					Consulting.searchTour(scanner);
				} catch (NoOptionException e) {
					System.out.println("No such an option!");
					Logger.write(e, "Error happened in the tour searching!");
				}
			} else {
				System.out.println("No such an option!");
				Logger.write(null, "Error happened in the main menu!");
				Consulting.indexPage();
				scanner.nextLine();
			}
		}
		System.out.print("\nGood luck!");
		scanner.close();
	}
}
