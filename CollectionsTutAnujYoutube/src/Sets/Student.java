package Sets;

import java.util.Objects;

public class Student {
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
