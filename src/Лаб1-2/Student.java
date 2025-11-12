import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    public String studentID;

    public List<Subject> works;

    public Student(String firstName, String lastName, String studentID) {

        super(firstName, lastName);

        this.studentID = studentID;

        this.works = new ArrayList<>();
    }

    public void addWork(Subject work) {
        this.works.add(work);
    }

    public List<Subject> getWorks() {
        return this.works;
    }

    public void displayInfo() {
        System.out.println("СТУДЕНТ: " + this.firstName + " " + this.lastName +
                " (ID: " + this.studentID + ")");
    }
}