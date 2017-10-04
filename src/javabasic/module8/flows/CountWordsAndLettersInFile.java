package javabasic.module8.flows;
/*
в файле текст
посчитать количество слов, количество букв, количество гласных
Нужно выводить не в консоль а в файл другой output.yuliya
файл input.yuliya с тектом должен быть на диске где-то
*/

import java.io.*;

public class CountWordsAndLettersInFile {

    public static void main(String[] args) {
        File in;
        File out;
        FileReader reader;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;

        try {
            in = new File("d:/input.yuliya");
            out = new File("d:/output.yuliya");
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
            fileWriter = new FileWriter(out);
            fileWriter.append("Words' quantity - ").append(Integer.toString(countWords));
            fileWriter.append("\nLetters' quantity - ").append(Integer.toString(countLetters));
            fileWriter.append("\nVowels' quantity - ").append(Integer.toString(countVowels));
            fileWriter.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fileWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
