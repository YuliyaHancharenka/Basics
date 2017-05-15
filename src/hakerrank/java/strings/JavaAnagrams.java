package hakerrank.java.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // 1st approach

        //char[] aArray = a.toLowerCase().toCharArray();
        //char[] bArray = b.toLowerCase().toCharArray();
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
        a = a.toLowerCase(); b = b.toLowerCase();
        if (a.length() == b.length()) {
            Map<Character, Integer> myMap = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (!myMap.containsKey(c)) {
                    myMap.put(c, 1);
                } else {
                    int count = myMap.get(c);
                    myMap.put(c, ++count);
                }
            }

            for (int i = 0; i < b.length(); i++) {
                char c = b.charAt(i);
                if (myMap.containsKey(c)) {
                    int count = myMap.get(c);
                    myMap.put(c, --count);
                }
            }
            return myMap.values().stream().filter(v->v>0).count() == 0;
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
