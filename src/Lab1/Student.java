package Lab1;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    public String studentID;
    public List<Subject> works; // Просто список робіт

    public Student(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.works = new ArrayList<>();
    }

    public void addWork(Subject work) {
        works.add(work);
    }

    public List<Subject> getWorks() {
        return works;
    }

    @Override
    public void displayInfo() {
        System.out.println("Студент: " + firstName + " " + lastName + " (ID: " + studentID + ")");
    }
}