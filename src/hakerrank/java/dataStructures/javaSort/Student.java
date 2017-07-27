package hakerrank.java.dataStructures.javaSort;


public class Student implements Comparable<Student> {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    //Complete the code
    @Override
    public int compareTo(Student o) {
        Student s = (Student) o;
        if (cgpa == s.cgpa) {
            if (fname.equals(s.fname)) {
                return id - s.id;
            } else {
                return fname.compareTo(s.fname);
            }
        } else {
            if (s.cgpa - cgpa > 0)
                return 1;
            else
                return -1;
        }
    }
}

