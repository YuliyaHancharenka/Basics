package diffTasks;

import java.util.Arrays;
import java.util.Scanner;


public class ReplaceSymbol {
    public static void main(String[] args) {
        //Пользователь вводит строку, например, "сколько сейчас времени в сколково?", потом указывает символ, который нужно удалить из строки,
        //например, "о" в результате работы программы должна получиться строка: "скльк сейчас времени в склкв?".
        // Потом доработать функционал так, чтобы оно работало не с одним символом, а с несколькими, например, "ко" - результат: "сль сейчас времени в слво?".
        // При этом нельзя использовать функции из класса String типа реплейсов и сабстрингов, а все делать через форы и массивы

 /*       String stringInput = "сколько сейчас времени в сколково?"; // сколько сейчас времени в сколково?
        char charToReplace = 'о';
        String stringToReplace = "ко";

        char[] origCharArray = stringInput.toCharArray();
        int count = 0;
        int origArraySize = origCharArray.length - 1;
        int stringToReplaceSize = stringToReplace.length() - 1;

        for (int i = 0; i < origArraySize; i++) {
            if (origCharArray[i] == charToReplace) {
                for (int j = i; j < origArraySize; j++) {
                    origCharArray[j] = origCharArray[j + 1];
                }
                count++;
            }
        }
        char[] resultCharArray = new char[origArraySize - count + 1];
        for (int i = 0; i < resultCharArray.length; i++) {
            resultCharArray[i] = origCharArray[i];
        }
        System.out.println(resultCharArray);*/

        String stringInput = "сколько?"; // сколько сейчас времени в сколково?
        char charToReplace = 'о';
        String stringToReplace = "ко";

        char[] origCharArray = stringInput.toCharArray();
        int count = 0;
        int origArraySize = origCharArray.length - 1;
        int stringToReplaceSize = stringToReplace.length();

        char[] arrayToReplace = stringToReplace.toCharArray();
        boolean isSubstring = false;

        for (int i = 0; i < origArraySize; i++) {
            if (origCharArray[i] == arrayToReplace[0]) {

                for (int j = 1; j < stringToReplaceSize; j++) {
                    if (origCharArray[i + j] == arrayToReplace[j]) {
                        isSubstring = true;
                    } else {
                        isSubstring = false;
                        break;
                    }
                }

                if (isSubstring) {
                    for (int j = i; j < origArraySize; j++) {
                        if (j+stringToReplaceSize < origArraySize) {
                            origCharArray[j] = origCharArray[j + stringToReplaceSize];
                            count++;
                        }
                        else {
                            break;
                        }
                    }

                }
            }
        }
        char[] resultCharArray = new char[origArraySize - count + 1];
        for (int i = 0; i < resultCharArray.length; i++) {
            resultCharArray[i] = origCharArray[i];
        }
        System.out.println(resultCharArray);

       /*String s = stringInput.replace("ко","");
       System.out.println(s);*/


    }
}