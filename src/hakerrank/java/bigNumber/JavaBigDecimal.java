package hakerrank.java.bigNumber;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Sorting (Selection)
        for (int i = 0; i < (s.length - 1); i++) {
            for (int k = (i + 1); k < s.length; k++) {
                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[k])) < 0) {
                    String tempValue = s[i];
                    s[i] = s[k];
                    s[k] = tempValue;
                }
            }
        }
        //Output

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
