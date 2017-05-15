package diffTasks;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1992, 11, 13);
        Date input = new Date();
        LocalDate currentDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int age = calculateAge(birthDate, currentDate);
        System.out.println(age);
    }
}
