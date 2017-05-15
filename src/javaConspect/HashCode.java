package javaConspect;


public class HashCode {
    public static void main(String[] args) {


        //hashCode()
        //Если хеш-коды разные, то и входные объекты гарантированно разные.
        //Если хеш-коды равны, то входные объекты не всегда равны.


        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

    }
}
