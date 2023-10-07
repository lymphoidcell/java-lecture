package StudentNew;

public class StudentNew {
    private String fName; // First name
    private String lName; // Last name
    private int stuId;    // Student ID
    private String stuStatus; // Student Status

    // Constructor to initialize a StudentNew object
    public StudentNew(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    // Getter methods
    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public int getStudentID() {
        return stuId;
    }

    public String getStudentStatus() {
        return stuStatus;
    }

    // Setter methods (optional)
    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public void setStudentID(int stuId) {
        this.stuId = stuId;
    }

    public void setStudentStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student Name: " + fName + " " + lName + "\nStudent ID: " + stuId + "\nStudent Status: " + stuStatus;
    }
}

