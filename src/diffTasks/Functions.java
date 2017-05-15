package diffTasks;


public class Functions {

    public static void main(String[] args) {

        /*boolean x = isPositive(1);
        System.out.println(x);
        System.out.println(isPositive(-1));
        System.out.println(isPositive(12));
        System.out.println(isPositive(-101));
        System.out.println(isPositive(-91));
        System.out.println(isPositive(+61));*/
        int[] nasratArray = {1, 1, 2, 6, 24, 120, 720, 5040, 9, 10, 11, 12, 13, 14, 15};

        printArraySize15(nasratArray);


    }


    public static boolean isPositive(int x) {
        boolean result;
        if (x > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public static void printArraySize15(int[] args) { // function name = printArray, function parameters = int[] args, result = int[] --

        // read p.56 (методы, переменные, возвращ.знач-я; список аргументов)

        for (int i = 0; i < 15; i++)
        {

            System.out.println(args[i]);
        }

    }

}
