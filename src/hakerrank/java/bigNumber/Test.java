package hakerrank.java.bigNumber;


import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void func(List x) {
        x.add(11);
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        x.add(10);
        func(x);
        System.out.println(x);

       
    }
    public String randomFirstName(){
        String firstName = "firstName_" + System.currentTimeMillis();
        return firstName;

    }
}
