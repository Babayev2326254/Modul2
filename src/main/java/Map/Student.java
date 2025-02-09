package Map;

import java.util.Objects;

public class Student {
    private final int id;
    private final String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
