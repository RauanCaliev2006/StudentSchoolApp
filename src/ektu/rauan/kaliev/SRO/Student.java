package ektu.rauan.kaliev.SRO;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Возраст меньше 18 лет!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + " лет)";
    }
}
