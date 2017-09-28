package hakerrank.java.advanced.javaSingletonPattern;


public class Singleton {
    private Singleton() {
    }

    public String str;
    private static Singleton instance = new Singleton();

    static Singleton getSingleInstance() {
        return instance;
    }
}

