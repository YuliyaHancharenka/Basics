package javabasic.module8.flows;
/*
в файле текст
посчитать количество слов, количество букв, количество гласных
в этом тексте и вывести
файл input.yuliya с тектом должен быть на диске где-то
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsAndLettersInFile {

    public static void main(String[] args) {
        File in;
        FileReader reader;
        BufferedReader bufferedReader = null;

        try {
            in = new File("d:/input2.yuliya");
            reader = new FileReader(in);
            bufferedReader = new BufferedReader(reader);

            String line;
            int countWords = 0;
            int countLetters = 0;
            int countVowels = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] countWordsArray;
                countWordsArray = line.split("[,.;: ]");
                for(int i = 0; i < countWordsArray.length; i++){
                    if(!countWordsArray[i].equals("")){
                        countWords++;
                        countLetters += countWordsArray[i].length();

                        char ch;
                        for(int j = 0; j < countWordsArray[i].length(); j++) {
                            ch = countWordsArray[i].charAt(j);
                            if(ch =='a' || ch =='i' || ch =='o' || ch =='e' || ch =='u'){
                                countVowels++;
                            }
                        }
                    }
                }
            }
            System.out.println("Words' quantity - " + countWords);
            System.out.println("Letters' quantity - " + countLetters);
            System.out.println("Vowels' quantity - " + countVowels);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
