package hakerrank.java.dataStructures;


import java.util.ArrayList;
import java.util.Scanner;


public class JavaArraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of lines
        int d;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            d = sc.nextInt(); //number of integers on each line
            for (int j = 0; j < d; j++) {
                subList.add(sc.nextInt());
            }
            mainList.add(subList);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                int num = mainList.get(x - 1).get(y - 1);
                System.out.println(num);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}


