public class CourseWork extends Subject {

    public String topic;

    public CourseWork(String subjectName, String topic) {
        super(subjectName);
        this.topic = topic;
    }

    public void showInfo() {
        System.out.println("-> Курсова з '" + this.subjectName + "' на тему '" + this.topic + "'");
    }
}