package hakerrank.java.introduction;


import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();


       /* LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.print(dt.getDayOfWeek());

        */

        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();

        Calendar cal = new GregorianCalendar(Locale.US);
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());


    }
}
