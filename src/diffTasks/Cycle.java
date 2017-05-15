package diffTasks;


public class Cycle {

    public static void main(String[] args) {

        Integer mass[] = {345, 53, 78,2, 8, 773, 82 , -20, 6, 90};

        /*

        System.out.println("mass size is " + mass.length);

        for(int i = 0; i < mass.length; i++) {
            System.out.println("[" + i + "] " + mass[i]);
        }*/

        findIndexMax(mass);

        findMax(mass);
        findmin(mass);
        Integer ass = amountsome(10,6);
System.out.println(ass);
    }

//   {345, 53, 78, 2, 8, 773, 82 , -20, 6, 90}
    public static Integer findMax(Integer[] mass) {

        Integer max = mass[0];
        for(int i = 1; i < mass.length; i++) {
            if(mass[i] > max) {
                max = mass[i];            }
        }
        System.out.println("max is " + max);
              return max;    }


    public static Integer findmin(Integer[] mass) {

        Integer min = mass[0];
        for(int i = 1; i < mass.length; i++) {
            if(mass[i] < min) {
                min = mass[i];            }
        }
        System.out.println("min is " + min);
        return min;    }


    public static Integer amountsome(Integer x,Integer y) {
           return x+y;

    }

    public static Integer findIndexMax(Integer[] mass) {

        Integer max = mass[0];
        Integer maxindex = 0;

        for(int i = 1; i < mass.length; i++) {
            if(mass[i] < max) {
                max = mass[i];
            maxindex=i;}
        }
        System.out.println("max index is " + maxindex);
        return null;}
}

