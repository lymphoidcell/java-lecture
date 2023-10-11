package Student;

public class Student {
    private int studentID;
    private String name;
    private String ssn;
    private double GPA;

    // Constructor to initialize a Student object
    public Student(int studentID, String name, String ssn, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.ssn = ssn;
        this.GPA = GPA;
    }

    // Default constructor
    public Student() {

    }

    // Getter methods
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getGPA() {
        return GPA;
    }

    // Setter methods (optional)
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return "Student ID: " + studentID + "\nName: " + name + "\nSSN: " + ssn + "\nGPA: " + GPA;
    }

}
