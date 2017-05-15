package hakerrank.java.introduction;


import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (in.hasNextLine()) {
            String s1 = in.nextLine();
            i++;
            s1 = i + " " + s1;
            System.out.println(s1);
        }
    }
}
