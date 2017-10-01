package hakerrank.java.objectOrientedProgramming;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###"))//Hints: use instanceof operator
            {
                break;
            }
        }
        return it;
    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
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
        }



        // Example
/*
        ArrayList<String> mylist1 = new ArrayList();
        mylist1.add("1");
        mylist1.add("2");
        mylist1.add("3");
        mylist1.add("4");
        mylist1.add("5");
        Iterator iterator = mylist1.iterator();

//possible for iterator removing
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println((String) element);
            if (element.equals("3")) {
                iterator.remove();
            }
        }
        mylist1.add("6");

//impossible for foreach cycle when removing
        /*for(String s : mylist1) {
            if(s.equals("3")){
                mylist1.remove(s);
            }
        }

//possible for for cycle when removing is in the end
        for (int i = mylist1.size()-1; i >=0; i--) {
            String s = mylist1.get(i);
            if(s.equals("3")) {
                mylist1.remove(s);
            }
        }
        mylist1.add("6");


        for (int i = 0; i < mylist1.size(); i++) {
            System.out.println(mylist1.get(i));
        }*/
    }
}
