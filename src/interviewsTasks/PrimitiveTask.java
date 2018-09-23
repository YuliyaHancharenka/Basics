package interviewsTasks;

public class PrimitiveTask {

    public static void foo(int a) {
        a = 3;
        //return a;
    }

    public static void main(String[] args) {
        int x = 17;
        foo(x);//x=foo(x);
        System.out.println(x);//17 or 3 (if return)
    }
}
