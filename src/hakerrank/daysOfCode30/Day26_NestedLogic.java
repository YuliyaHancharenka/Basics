package hakerrank.daysOfCode30;


import java.util.Scanner;

public class Day26_NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine = 0;

        Scanner in = new Scanner(System.in);
        int actualDate[] = new int[3];
        for (int i = 0; i < 3; i++) {
            actualDate[i] = in.nextInt();
        }
        int expectedDate[] = new int[3];
        for (int i = 0; i < 3; i++) {
            expectedDate[i] = in.nextInt();
        }

        if (actualDate[0] <= expectedDate[0] && actualDate[1] <= expectedDate[1] && actualDate[2] <= expectedDate[2]) {
            fine = 0;
        } else if (actualDate[0] >= expectedDate[0] && actualDate[1] == expectedDate[1] && actualDate[2] == expectedDate[2]) {
            fine = (actualDate[0] - expectedDate[0]) * 15;
        } else if (actualDate[1] > expectedDate[1] && actualDate[2] == expectedDate[2]) {
            fine = (actualDate[1] - expectedDate[1]) * 500;
        } else if (actualDate[2] > expectedDate[2]) {
            fine = 10000;
        }

        System.out.println(fine);
    }
}
