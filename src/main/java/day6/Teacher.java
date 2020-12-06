package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        String mark;
        switch((random.nextInt(4)) + 2) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + (random.nextInt(4)) + 2);
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + mark + ".");
    }
}
