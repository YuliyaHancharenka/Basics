package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company;

import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.exceptions.NoOptionException;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.exceptions.TourNotFoundException;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.tours.Tour;
import tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils.Logger;

import java.util.*;

public class Consulting {

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

    private static void getReference(int choice) throws NoOptionException {
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
                infoPage();
                throw new NoOptionException("No such an option! - " + choice + "!\n");

        }
    }

    public static void giveReference(Scanner scanner) {
        infoPage();
        scanner.next();
        while (!scanner.hasNext("0")) {
            try {
                Consulting.getReference(scanner.nextInt());
            } catch (NoOptionException e) {
                System.out.println(e.getMessage());
                Logger.write(e, "Error happened in the getting reference!");
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch, please check your input");
                Logger.write(e, "Error happened in the getting reference!");
            }
        }
        scanner.next();
        indexPage();
    }

    // Search Page

    private static void findByNumberOfDays(int minNumberOfDays, int maxNumberOfDays) throws TourNotFoundException {
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
            throw new TourNotFoundException("No results found for range [" + minNumberOfDays + ";" + maxNumberOfDays + "]\n");
        }
    }

    private static void findByFoodCondition(String foodCondition) throws TourNotFoundException {
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
            throw new TourNotFoundException("No results found for value '" + foodCondition + "'");
        }
    }

    private static void findByTransport(String transport) throws TourNotFoundException {
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
            throw new TourNotFoundException("No results found for value '" + transport + "'\n");
        }
    }

    public static void searchTour(Scanner scanner) throws NoOptionException {
        searchPage();
        scanner.next();
        while (!scanner.hasNext("0")) {
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("\nPlease, specify minimal Number of Days and press 'Enter': ");
                    int minNumberOfDays = Integer.parseInt(scanner.next());
                    System.out.println("\nPlease, specify maximal Number of Days and press 'Enter': ");
                    int maxNumberOfDays = Integer.parseInt(scanner.next());

                    try {
                        findByNumberOfDays(minNumberOfDays, maxNumberOfDays);
                    } catch (TourNotFoundException e) {
                        System.out.println(e.getMessage());
                        Logger.write(e, "Error happened in the tour finding by number of days!\n");
                    }

                    searchPage();
                    break;
                case "2":
                    System.out.println("\nPlease, specify food condition (OB, BB, ALL) and press 'Enter': ");
                    String foodCondition = scanner.next();
                    try {
                        findByFoodCondition(foodCondition);
                    } catch (TourNotFoundException e) {
                        System.out.println(e.getMessage());
                        Logger.write(e, "Error happened in the tour finding by food condition!");
                    }

                    searchPage();
                    break;
                case "3":
                    System.out.println("\nPlease, specify transport (Bus, Plane, Train, Ship) and press 'Enter': ");
                    String transport = scanner.next();
                    try {
                        findByTransport(transport);
                    } catch (TourNotFoundException e) {
                        System.out.println(e.getMessage());
                        Logger.write(e, "Error happened in the tour finding by transport condition!");
                    }

                    searchPage();
                    break;
                default:
                    infoPage();
                    throw new NoOptionException("No such an option - " + choice + "!\n");
            }
        }
        scanner.next();
        indexPage();
    }
}
