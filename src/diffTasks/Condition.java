package diffTasks;

public class Condition {

    public static void main(String[] args) {

        Double x = 8.7;
        Double y = 8.7;

        String str = compareWithTwoDoubles(x, y);
        System.out.println(str);

    }
        public static String compareWithTwoDoubles(double first, double second) {

            String result = null;
            if(first > second) {
                result = first + " больше " + second;
            }
            else if(first == second) {
                result =  first + " равно " + second;
            }
            else {
                result =  first + " меньше " + second;
            }

            return result;
    }
}
