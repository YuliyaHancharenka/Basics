package javaLambda;

@FunctionalInterface
public interface FunctionalInterfaceTest {

    default void test(){
        System.out.println("Test default");
    }

     void run();

}
