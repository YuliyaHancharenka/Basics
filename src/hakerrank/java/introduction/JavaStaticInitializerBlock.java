package hakerrank.java.introduction;

import java.util.*;

public class JavaStaticInitializerBlock {

    static boolean flag;
    static Scanner in;
    static int B;
    static int H;

    static {
        in = new Scanner(System.in);
        flag = true;
        B = in.nextInt();
        H = in.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
