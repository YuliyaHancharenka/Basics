package hakerrank.java.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // 1st approach

        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
 /*       if (aArray.length == bArray.length) {
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            for (int i = 0; i < aArray.length; i++) {
                if (aArray[i] != bArray[i]) {
                    return false;
                }
            }
            return true;
        }*/

        // 2nd approach
        if (aArray.length == bArray.length) {
            Map myMap = new HashMap();
            for (int i = 0; i < aArray.length; i++){
                if (myMap.containsKey(i) == true){

                }
            }

        }
        return false;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
