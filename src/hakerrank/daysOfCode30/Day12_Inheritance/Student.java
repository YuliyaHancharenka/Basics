package hakerrank.daysOfCode30.Day12_Inheritance;


public class Student extends Person {
    private int testScores[];
    int avg;
    int sum;
    String grade;

    // Constructor
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    String calculate() {
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }
        avg = sum / testScores.length;

        if(avg< 40)

    {
        grade = "T";
    } else if(avg >=40&&avg< 55)

    {
        grade = "D";
    } else if(avg >=55&&avg< 70)

    {
        grade = "P";
    } else if(avg >=70&&avg< 80)

    {
        grade = "A";
    } else if(avg >=80&&avg< 90)

    {
        grade = "E";
    } else if(avg >=90&&avg <=100)

    {
        grade = "O";
    }
        return grade;
}
}
