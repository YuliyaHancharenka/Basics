package hakerrank.java.advanced.javaSingletonPattern;


public class Main {


    public static void main(String[] args) {

        Singleton s1 = Singleton.getSingleInstance();
        s1.str = "Olololool";

        Singleton s2 = Singleton.getSingleInstance();
        System.out.println(s2.str);
    }

}
