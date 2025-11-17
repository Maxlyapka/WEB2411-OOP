package lab2;

import java.util.List;

public class Student extends Person {

    private String studentID;
    private GradeBook gradeBook;

    public Student(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.gradeBook = new GradeBook();
    }

    public String getStudentID() { return studentID; }
    public GradeBook getGradeBook() { return gradeBook; }

    public void addWork(Subject work) { gradeBook.addSubject(work); }

    public List<Subject> getWorks() { return gradeBook.getSubjects(); }

    public void displayInfo() {
        System.out.println("СТУДЕНТ: " + getFirstName() + " " + getLastName() +
                " (ID: " + studentID + ")");
    }
}
