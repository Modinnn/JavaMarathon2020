package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("STUDENT_NAME", "GROUP_NAME");
        Teacher teacher = new Teacher("TEACHER_NAME", "SUBJECT_NAME");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
