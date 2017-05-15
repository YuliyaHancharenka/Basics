package hakerrank;


public class BitOperations {

    public static void main(String[] args) {

        //int a = 3;
        //int b = 8;

// & | ^ >> <<
        //System.out.println(b >> 7);

        char[] seq = {'a','b','b','a'};
        int result = 0; //0000000000000000000000
        //1 = 0000000000000000001
        //1<<1 = 01000000000000000
        //1<<2 = 00000000000000100

        //1) 'a' -> 001 -> 000 ^ 001 = 001
        //2) 'b' -> 010 -> 001 ^ 010 = 011
        //3) 'b' -> 010 -> 011 ^ 010 = 001
        //4) 'a' -> 001 -> 001 ^ 001 = 000
        //5) 'c' -> 100 -> 000^ 100 = 100 <- result


// Можно ли палиндром сделать:

 /*       for (char current : seq) {
            result = result ^ (1 << (current - 'a'));
        }
        if ((result & (result - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }*/


// Четное ли кол-во буквы:
        for (char current : seq) {
            result = result ^ (current - 'a');
        }
        if (result == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }

}
