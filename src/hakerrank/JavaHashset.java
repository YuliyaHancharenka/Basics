package hakerrank;


import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        String[] pair = new String[t];
        int count = 0;
        HashSet myHashSet = new HashSet();

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            pair[i] = pair_left[i] + " " + pair_right[i];
            myHashSet.add(pair[i]);
            System.out.println(myHashSet.size());
        }
    }
}
