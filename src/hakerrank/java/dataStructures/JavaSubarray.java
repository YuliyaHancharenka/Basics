package hakerrank.java.dataStructures;


import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaSubarray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        IntStream.range(0, n).forEach(i -> a[i] = in.nextInt());            // fill array, instead of FOR loop

        int count = 0;
        for (int shift = 0; shift < n; shift++)
            for (int i = 0; i < n - shift; i++) {
                if (isSumNegative(a, i, i + shift)) {
                    count++;
                }
            }
        System.out.println(count);
    }

    private static boolean isSumNegative(int[] a, int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum = sum + a[i];
        }
        if (sum < 0){
            return true;
        }
        return false;
    }
}
