package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnSortingCustomClassesUsingComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Anuj",2));
        list.add(new Student("Ramesh",4));
        list.add(new Student("Shivam",3));
        list.add(new Student("Gitesh",1));
//        list.add(new Student("Bhasker",2));



        // We need to compare two student objects so we need to implement the student class with Comparable
        // let's do some Comparisons
        Student s1 = new Student("Gitesh", 5);
        Student s2 = new Student("Mahima", 9);

        // that = s2 ie. 9 and this = s1 = 5 --> this - that = 5-9 = -4
        System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));

        System.out.println("list before sort = " + list);
        Collections.sort(list);
        System.out.println("list after sort = " + list);
        // list = [Student{name='Gitesh', rollNo=1}, Student{name='Anuj', rollNo=2}, Student{name='Shivam', rollNo=3}, Student{name='Ramesh', rollNo=4}]



    }
}
