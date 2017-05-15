package diffTasks;
import java.util.*;

public class Set {
    public static void main(String[] args) {
//Есть текст, вывести все слова, которые встречаются без повторений "Мама мылом мыла мыла мыло" (мама, мылом, мыла, мыло). Тут уже новая коллекция Set
//Вывести в отсортированной порядке затем set

        String stringInput = "Мама мылом мыла мыла мыло";
        String stringInput2 = stringInput.replaceAll("[.:,!?]", "");
        String[] parts = stringInput2.split(" ");

        //HashSet<String> myHashSet = new HashSet<String>();
        TreeSet<String> myTreeSet = new TreeSet<String>();
        for (int i = 0; i < parts.length; i++){
            //myHashSet.add(parts[i]);
            myTreeSet.add(parts[i]);
        }
        //System.out.println(myHashSet);
        System.out.println(myTreeSet);
    }
}



