package ektu.rauan.kaliev.SRO;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Арайлым", 19);
        school.addStudent("Рауан", 17);
        school.addStudent("Арай", 20);

        school.showAll();
    }
}
