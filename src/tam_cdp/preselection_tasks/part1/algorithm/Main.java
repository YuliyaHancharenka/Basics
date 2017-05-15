package tam_cdp.preselection_tasks.part1.algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Number of strings can't be one");
        }
        List<String> listOfStrings = new ArrayList<>(n);
        in.nextLine();
        for (int i = 0; i < n; i++) {
            listOfStrings.add(i, in.nextLine());

        }
        Comparator<String> stringLengthComparator = new StringLengthComparator();
        Collections.sort(listOfStrings, stringLengthComparator);
        System.out.println("Sorted by string length list:");
        for (String str : listOfStrings) {
            System.out.println(str);
        }
        System.out.println("Second by length string in a list is: " + listOfStrings.get(1));
    }
}
