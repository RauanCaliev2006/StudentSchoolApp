package ektu.rauan.kaliev.SRO;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int age) {
        try {
            Student st = new Student(name, age);
            students.add(st);
            System.out.println("Студент добавлен: " + st);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка при добавлении: " + e.getMessage());
        }
    }

    public void showAll() {
        System.out.println("\nСписок всех студентов:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
