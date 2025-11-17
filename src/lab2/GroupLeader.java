package lab2;

public class GroupLeader extends Student {

    public GroupLeader(String firstName, String lastName, String studentID) {
        super(firstName, lastName, studentID);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("(Це староста групи)");
    }
}
