package Collections;

import java.util.Objects;

public class Student implements Comparable<Student>{
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


    // WITH ONE CLASS THERE CAN BE ONLY ONE COMPARABLE METHOD

    // When we want to sort according to rollNo value
//    @Override
//    public int compareTo(Student that) {
//        // +ve value means this wala element is Greater
//        // -ve value means that wala element is Greater
//        // 0 value means both are Same, ie. this == that
//        return this.rollNo - that.rollNo;
//    }

    @Override
    public int compareTo(Student that) {
        // we are able to do like this as name is a String and String already implements
        // compareTo method....
        return this.name.compareTo(that.name);
    }
}
