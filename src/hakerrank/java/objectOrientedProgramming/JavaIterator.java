package hakerrank.java.objectOrientedProgramming;


import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)//Hints: use instanceof operator
            {
                break;
            }
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        /*ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }*/


        /*самый банальный пример: попытайся удалить элемент из коллекции
        вот просто пока откинь все
        закинь в коллекцию 5 разных строк
        и удали например 3ую в for цикле
        что будет*/
        String s = null;
        ArrayList<String> mylist = new ArrayList();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
        mylist.add("5");
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }

        while (it.hasNext()) {
            if (it.next().equals("3")) {
                it.remove();
                mylist.add("6");
            }
        }

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
