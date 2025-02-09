package StudentManagmentSystem;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student oth) {
        int compare = Integer.compare(this.getId(), oth.getId());
        return compare;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }


    public static Comparator<Student> AgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.age, o2.age);
        }
    };

    public static Comparator<Student> GradeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.grade, o2.grade);
        }
    };


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

}
