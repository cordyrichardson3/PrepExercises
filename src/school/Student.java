package school;

public class Student {

    private String firstName;
    private String lastName;
    private final int studentId;
    private double gpa;

    private final static String schoolName = "Hello World High School";

    public Student(String firstName, String lastName, int studentId, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName, int studentId) {
        this(firstName, lastName, studentId, 0.0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
