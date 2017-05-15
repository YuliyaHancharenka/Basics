package tam_cdp.preselection_tasks.part2.avialines_orig.aviacompany;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

import tam_cdp.preselection_tasks.part2.avialines_orig.plains.Plane;

public class HelpDesk implements BrandName {

	@Override
	public String getBrandName() {
		return brandName + "Consulting";
	}

	public static void welcomeHelp() {
		System.out.println("\nPlease, enter your choice: ");
		System.out.println("1 - to see Plains Reference Information;");
		System.out.println("2 - to search Plain by parameters;");
		System.out.println("'exit' - to quit.");
	}

	private static void welcomeInfoPage() {
		System.out.println("\nPlease, enter your choice: ");
		System.out.println("1 - to see the Total Cargo Capacity;");
		System.out.println("2 - to see Total Passenger Capacity;");
		System.out.println("3 - to see Ascending Flight Range;");
		System.out.println("4 - to see Descending Flight Range;");
		System.out.println("0 - go to Main menu.");
	}

	private static void welcomeSearchPage() {
		System.out.println("\nPlease, enter: ");
		System.out.println("1 - to search by Cargo Capacity;");
		System.out.println("2 - to search by Passenger Capacity;");
		System.out.println("3 - to search by Flight Range;");
		System.out.println("0 - go to Main menu.");
	}

	// Info

	private static void getReference(int choice) {
		StatisticBureau sb = new StatisticBureau();
		switch (choice) {
		case 1:
			System.out.println("Total Cargo Capacity is "
					+ sb.getTotalCargoCapacity() + " tons.");
			break;
		case 2:
			System.out.println("Total Passenger Capacity is "
					+ sb.getTotalPassengerCapacity() + " people.");
			break;
		case 3:
			TreeMap<Integer, String> map = sb.sortByflightRangeAsc();
			System.out.println("Ascending Flight Range is the following: ");
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				int key = entry.getKey();
				String value = entry.getValue();
				System.out.println(value + " => " + key);
			}
			break;
		case 4:
			NavigableMap<Integer, String> map2 = sb.sortByflightRangeDesc();
			System.out.println("Descending Flight Range is the following: ");
			for (Map.Entry<Integer, String> entry : map2.entrySet()) {
				int key = entry.getKey();
				String value = entry.getValue();
				System.out.println(value + " => " + key);
			}
			break;
		default:
			System.out.println("No such an option!\n");
			welcomeInfoPage();
		}
	}

	public static void giveReference(Scanner scanner) {
		welcomeInfoPage();
		scanner.next();
		while (!scanner.hasNext("0")) {
			HelpDesk.getReference(scanner.nextInt());
		}
		scanner.next();
		welcomeHelp();
	}

	// Search

	private static void cargoSearch(int minCargoCap, int maxCargoCap) {
		StatisticBureau sb = new StatisticBureau();
		AircraftFleet af = sb.getAirFl();
		int i = 0;
		for (Plane pl : af) {
			if (minCargoCap < pl.getCargoCapacity()
					& pl.getCargoCapacity() < maxCargoCap) {
				System.out.println(pl.getPlaneName() + " has capacity "
						+ pl.getCargoCapacity() + " tons.");
				i++;
			}
		}
		if (i == 0) {
			System.out.println("No results found.");
		}
	}

	private static void passengerSearch(int minPassengerCap, int maxPassengerCap) {
		StatisticBureau sb = new StatisticBureau();
		AircraftFleet af = sb.getAirFl();
		int i = 0;
		for (Plane pl : af) {
			if (minPassengerCap < pl.getPassengerCapacity()
					& pl.getPassengerCapacity() < maxPassengerCap) {
				System.out.println(pl.getPlaneName() + " has capacity for "
						+ pl.getPassengerCapacity() + " people.");
				i++;
			}
		}
		if (i == 0) {
			System.out.println("No results found.");
		}
	}

	private static void flightRangeSearch(int minFlightRange, int maxFlightRange) {
		StatisticBureau sb = new StatisticBureau();
		AircraftFleet af = sb.getAirFl();
		int i = 0;
		for (Plane pl : af) {
			if (minFlightRange < pl.getFlightRange()
					& pl.getFlightRange() < maxFlightRange) {
				System.out.println(pl.getPlaneName() + " can fly on "
						+ pl.getFlightRange() + " km.");
				i++;
			}
		}
		if (i == 0) {
			System.out.println("No results found.");
		}
	}

	public static void searchPlane(Scanner scanner) {
		welcomeSearchPage();
		scanner.next();
		while (!scanner.hasNext("0")) {
			switch (scanner.next()) {
			case "1":
				System.out
						.println("\nPlease, specify minimal Cargo Capacity and press 'Enter': ");
				int minCargoCap = Integer.parseInt(scanner.next());
				System.out
						.println("\nPlease, specify maximal Cargo Capacity and press 'Enter': ");
				int maxCargoCap = Integer.parseInt(scanner.next());
				cargoSearch(minCargoCap, maxCargoCap);
				welcomeSearchPage();
				break;
			case "2":
				System.out
						.println("\nPlease, specify minimal Passenger Capacity and press 'Enter': ");
				int minPassengerCap = Integer.parseInt(scanner.next());
				System.out
						.println("\nPlease, specify maximal Passenger Capacity and press 'Enter': ");
				int maxPassengerCap = Integer.parseInt(scanner.next());
				passengerSearch(minPassengerCap, maxPassengerCap);
				welcomeSearchPage();
				break;
			case "3":
				System.out
						.println("\nPlease, specify minimal Flight Range and press 'Enter': ");
				int minFlightRange = Integer.parseInt(scanner.next());
				System.out
						.println("\nPlease, specify maximal Flight Range and press 'Enter': ");
				int maxFlightRange = Integer.parseInt(scanner.next());
				flightRangeSearch(minFlightRange, maxFlightRange);
				welcomeSearchPage();
				break;
			default:
				System.out.println("No such an option!\n");
				welcomeInfoPage();
			}
		}
		scanner.next();
		welcomeHelp();
	}
}
