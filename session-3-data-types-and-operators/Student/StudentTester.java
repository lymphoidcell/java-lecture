package Student;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student(123, "Mary Smith", "999-99-9999", 3.4);
        System.out.println(s1);

        Student s2 = new Student();
        s2.setStudentID(124);
        s2.setName("John Jacoby");
        s2.setSsn("123-45-6789");
        s2.setGPA(4.0);
        System.out.println(s2);

        Student s3 = new Student();
        System.out.println(s3);
    }
}
