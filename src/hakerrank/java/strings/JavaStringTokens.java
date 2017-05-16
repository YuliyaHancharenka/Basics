package hakerrank.java.strings;


import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        s = s.trim();
        String[] parts = s.split("[\\s!,?._'@]+");
        if (s.length() == 0) {
            System.out.println("0");
        } else {
            System.out.println(parts.length);
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }
            scan.close();
        }
    }
}
