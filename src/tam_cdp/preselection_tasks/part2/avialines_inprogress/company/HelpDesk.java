package tam_cdp.preselection_tasks.part2.avialines_inprogress.company;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

import tam_cdp.preselection_tasks.part2.avialines_inprogress.tours.Tour;

public class HelpDesk {

     public static void indexPage() {
        System.out.println("\nPlease, enter your choice: ");
        System.out.println("1 - to see Tours List information;");
        System.out.println("2 - to search Tour by parameters;");
        System.out.println("'exit' - to quit.");
    }

    private static void infoPage() {
        System.out.println("\nPlease, enter your choice: ");
        System.out.println("1 - to see Relax Tours Proposals;");
        System.out.println("2 - to see Tours Proposals with different purposes;");
        System.out.println("3 - to see Ascending Tours' Number of Days;");
        System.out.println("4 - to see Descending Tours' Number of Days;");
        System.out.println("0 - go to Main menu.");
    }

    private static void searchPage() {
        System.out.println("\nPlease, enter: ");
        System.out.println("1 - to search by number of days;");
        System.out.println("2 - to search by food condition;");
        System.out.println("3 - to search by transport condition;");
        System.out.println("0 - go to Main menu.");
    }

    // Info Page

    private static void getReference(int choice) {
        Statistics sb = new Statistics();
        switch (choice) {
            case 1:
                System.out.println("Relax Tours Proposals are "
                        + sb.getRelaxToursProposals());
                break;
            case 2:
                System.out.println("Tours Proposals with different purposes are "
                        + sb.getOtherPurposeProposals());
                break;
            case 3:
                TreeMap<Integer, String> map = sb.sortByNumberOfDaysAsc();
                System.out.println("Ascending Tours' Numbers of Days are the following: ");
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    int key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(value + " - " + key);
                }
                break;
            case 4:
                NavigableMap<Integer, String> map2 = sb.sortByNumberOfDaysDesc();
                System.out.println("Descending Tours' Numbers of Days are the following: ");
                for (Map.Entry<Integer, String> entry : map2.entrySet()) {
                    int key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(value + " - " + key);
                }
                break;
            default:
                System.out.println("No such an option!\n");
                infoPage();
        }
    }

    public static void giveReference(Scanner scanner) {
        infoPage();
        scanner.next();
        while (!scanner.hasNext("0")) {
            HelpDesk.getReference(scanner.nextInt());
        }
        scanner.next();
        indexPage();
    }

    // Search Page

    private static void findByNumberOfDays(int minNumberOfDays, int maxNumberOfDays) {
        Statistics sb = new Statistics();
        ToursProposals toursProposals = sb.getToursProp();
        boolean hasNoResults = true;
        for (Tour tour : toursProposals.getTours()) {

            if (minNumberOfDays < tour.getNumberOfDays()
                    & tour.getNumberOfDays() < maxNumberOfDays) {
                System.out.println(tour.getTourName() + " has "
                        + tour.getNumberOfDays() + " days.");
                hasNoResults = false;
            }
        }
        if (hasNoResults) {
            System.out.println("No results found.");
        }
    }

    private static void findByFoodCondition(String foodCondition) {
        Statistics sb = new Statistics();
        ToursProposals toursProposals = sb.getToursProp();
        boolean hasNoResults = true;
        for (Tour tour : toursProposals.getTours()) {

            if (tour.getFood().getValue().equals(foodCondition)) {
                System.out.println(tour.getTourName() + " has "
                        + tour.getFood().getValue() + " food condition.");
                hasNoResults = false;
            }
        }
        if (hasNoResults) {
            System.out.println("No results found.");
        }
    }

    private static void findByTransport(String transport) {
        Statistics sb = new Statistics();
        ToursProposals toursProposals = sb.getToursProp();
        boolean hasNoResults = true;
        for (Tour tour : toursProposals.getTours()) {

            if (tour.getTransport().getValue().equals(transport)) {
                System.out.println(tour.getTourName() + " has "
                        + tour.getTransport().getValue() + " transport.");
                hasNoResults = false;
            }
        }
        if (hasNoResults) {
            System.out.println("No results found.");
        }
    }

    public static void searchTour(Scanner scanner) {
        searchPage();
        scanner.next();
        while (!scanner.hasNext("0")) {
            switch (scanner.next()) {
                case "1":
                    System.out.println("\nPlease, specify minimal Number of Days and press 'Enter': ");
                    int minNumberOfDays = Integer.parseInt(scanner.next());
                    System.out.println("\nPlease, specify maximal Number of Days and press 'Enter': ");
                    int maxNumberOfDays = Integer.parseInt(scanner.next());
                    findByNumberOfDays(minNumberOfDays, maxNumberOfDays);
                    searchPage();
                    break;
                case "2":
                    System.out.println("\nPlease, specify food condition (OB, BB, ALL) and press 'Enter': ");
                    String foodCondition = scanner.next();
                    findByFoodCondition(foodCondition);
                    searchPage();
                    break;
                case "3":
                    System.out.println("\nPlease, specify transport (Bus, Plane, Train, Ship) and press 'Enter': ");
                    String transport = scanner.next();
                    findByTransport(transport);
                    searchPage();
                    break;
                default:
                    System.out.println("No such an option!\n");
                    infoPage();
            }
        }
        scanner.next();
        indexPage();
    }
}
