package javabasic.module8.flows;

import java.util.*;
import java.io.*;

/*
Есть файл, в нем текст.
Посчитай количество слов в тексте и ответ запиши в другой файл in.txt и out.txt например

*/
public class WordQtyCount {

    public static void main(String[] args) {
        File in = null, out = null;
        FileReader reader;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        try {
            in = new File("d:/input.txt");
            out = new File("d:/output.txt");
            reader = new FileReader(in);
            bufferedReader = new BufferedReader(reader);

            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                count += line.split(" ").length;
            }

            fileWriter = new FileWriter(out);
            fileWriter.append("Количество слов - ").append(Integer.toString(count));
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


