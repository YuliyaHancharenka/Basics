package hakerrank.daysOfCode30;


import java.util.*;

public class Day27_Testing {
    public static void main(String[] args) {
        final int T = 5;
        final int MAX_N = 200;

        Map<Integer, Integer> ns = new HashMap<>();
        Random random = new Random();

        do {
            int n = 3 + random.nextInt(MAX_N - 3) + 1;
            if (!ns.containsKey(n)) {
                int k = random.nextInt(n - 3) + 3;
                ns.put(n, k);
            }
        } while (ns.size() != 5);

        int j = 0;
        String[] answers = new String[]{"YES", "NO", "YES", "NO", "YES"};

        System.out.println("5");
        for (Map.Entry<Integer, Integer> entry : ns.entrySet()) {
            int n = entry.getKey();
            int k = entry.getValue();
            int a[] = new int[n];
            a[0] = 0;
            a[1] = -1;
            a[2] = 1;
            if (answers[j].equals("YES")) {
                for (int i = 3; i < n; i++) {
                    int t = (random.nextInt(25) + 1);
                    a[i] = t;
                }
            } else {
                for (int i = 3; i < n; i++) {
                    int t = -1 * random.nextInt(25) + 1;
                    a[i] = t;
                }
            }
            j++;

            System.out.println(n + " " + k);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
