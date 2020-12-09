package day9.Task1;

public class Student extends Human {
    String groupName;

    public Student(String name, String group) {
        super(name);
        this.groupName = group;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
