package tam_cdp.preselection_tasks.part3.tourAgencyWithExcAndPrinter.company.utils;

import java.io.*;
import java.util.Date;


public class Logger {

    private static final String FILE_PATH = "D:\\ErrorLog.txt";

    public static void write(Exception exception, String message) {

        File fout = new File(FILE_PATH);

        try {
            FileOutputStream fos = new FileOutputStream(fout, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            osw.write(new Date() + " >> " + message);
            osw.write("\r\n");
            if(exception != null) {
                osw.write("StackTrace: " + exception.getClass().getCanonicalName() + ": " + exception.getMessage());
                osw.write("\r\n");
            }

            osw.write("\r\n");
            osw.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Logging FileNotFoundException Error");
        } catch (IOException ex) {
            System.out.println("Logging IO Error");
        }
    }
}
