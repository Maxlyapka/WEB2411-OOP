public class LaboratoryWork extends Subject {

    public int labNumber;

    public LaboratoryWork(String subjectName, int labNumber) {
        super(subjectName);
        this.labNumber = labNumber;
    }

    public void showInfo() {
        System.out.println("-> Лаба №" + this.labNumber + " з '" + this.subjectName + "'");
    }
}