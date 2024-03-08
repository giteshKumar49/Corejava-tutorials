package Sets;

import java.util.HashSet;
import java.util.Set;

public class LearnSetForCustomClass {
    public static void main(String[] args) {
//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add(new Student("Anuj",2));
//        studentSet.add(new Student("Gitesh",4));
//        studentSet.add(new Student("Shivam",3));
//        studentSet.add(new Student("Anuj",2));
//
//        System.out.println("studentSet = " + studentSet);
        // studentSet = [Student{name='Shivam', rollNo=3}, Student{name='Gitesh', rollNo=4}, Student{name='Anuj', rollNo=2}, Student{name='Anuj', rollNo=2}]
        /*
        *  Here, HashSet will not be able to distinguish that
        * studentSet.add(new Student("Anuj",2));
        studentSet.add(new Student("Anuj",2));
        *
        * these are same as it the set they are different objects so it will permit it.
        *
        * */
        // Now, we need to tell that these are different.
        // For this we have to implement .equals() and .hashCode() methods in Student class


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Anuj",2));
        studentSet.add(new Student("Gitesh",4));
        studentSet.add(new Student("Shivam",3));
        studentSet.add(new Student("Rohit",2));

        System.out.println("studentSet = " + studentSet);
        // studentSet = [Student{name='Anuj', rollNo=2}, Student{name='Shivam', rollNo=3}, Student{name='Gitesh', rollNo=4}]
        // Rohit was not inserted as roll no was SAME....

    }
}
