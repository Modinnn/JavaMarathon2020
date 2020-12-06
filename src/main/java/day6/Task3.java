package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ПРЕПОДАВАТЕЛЬ", "ПРЕДМЕТ");
        Student student = new Student("СТУДЕНТ");
        teacher.evaluate(student);
    }
}
