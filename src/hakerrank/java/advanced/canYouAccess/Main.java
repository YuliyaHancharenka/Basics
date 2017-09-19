package hakerrank.java.advanced.canYouAccess;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            // 1st approach
            // System.out.println(num + " is " + ((Inner.Private) (o = new Inner().new Private())).powerof2(num));

            // 2nd approach
            o = new Object();
            Main.Inner instance = new Main.Inner();
            Inner.Private inner = instance.new Private();
            o = inner;
            System.out.println(num + " is " + inner.powerof2(num));

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution
