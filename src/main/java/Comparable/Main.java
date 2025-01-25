package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aysel", 22, 85.5));
        students.add(new Student("Orxan", 20, 90.0));
        students.add(new Student("Leyla", 25, 88.0));

        System.out.println("Sıralanmamış siyahı:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Təbii sıralama (yaşa görə)
        Collections.sort(students);

        System.out.println("\nYaşa görə sıralanmış siyahı:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
