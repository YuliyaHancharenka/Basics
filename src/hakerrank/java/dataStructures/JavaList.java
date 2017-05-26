package hakerrank.java.dataStructures;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            l.add(i, in.nextInt());
        }

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            in.nextLine();// Scanner particularity  <-- has to be after int reading before String reading
            String query = in.nextLine();
            if ("Insert".equals(query)) {  // not use '==', cause with '==' ONLY PRIMITIVES compare
                int x = in.nextInt();
                int y = in.nextInt();
                l.add(x, y);

            } else if ("Delete".equals(query)) {  // not use '==', cause with '==' ONLY PRIMITIVES compare
                int x = in.nextInt();
                l.remove(x);
            }
        }
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}