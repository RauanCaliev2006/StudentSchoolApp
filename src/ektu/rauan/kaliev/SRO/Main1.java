package ektu.rauan.kaliev.SRO;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {

        School school = new School();
        school.addStudent("Арайлым", 19);
        school.addStudent("Рауан", 17);
        school.addStudent("Арай", 20);
        school.showAll();

        System.out.println("Проверяем:");

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Арайлым", 85);
        grades.put("Арай", 40);

        try {
            findGrade(grades, "Арайлым");
        } catch (StudentNotFoundException e) {
            System.out.println("Такого студента нет: " + e.getMessage());
        } catch (LowGradeException e) {
            System.out.println("Низкая оценка: " + e.getMessage());
        }

        try {
            findGrade(grades, "Арай");
        } catch (StudentNotFoundException e) {
            System.out.println("Такого студента нет: " + e.getMessage());
        } catch (LowGradeException e) {
            System.out.println("Низкая оценка: " + e.getMessage());
        }

        try {
            findGrade(grades, "Бота");
        } catch (StudentNotFoundException e) {
            System.out.println("Такого студента нет: " + e.getMessage());
        } catch (LowGradeException e) {
            System.out.println("Низкая оценка: " + e.getMessage());
        }
    }

    public static void findGrade(Map<String, Integer> grades, String name)
            throws StudentNotFoundException, LowGradeException {

        if (!grades.containsKey(name)) {
            throw new StudentNotFoundException(name);
        }

        int g = grades.get(name);

        if (g < 50) {
            throw new LowGradeException(name + " получил " + g);
        }

        System.out.println(name + " сдал с оценкой " + g);
    }
}
