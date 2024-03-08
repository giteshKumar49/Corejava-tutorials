package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnSortingCustomClassUsingComparator {
    public static void main(String[] args) {

        List<StudentUsingComparator> list = new ArrayList<>();
        list.add(new StudentUsingComparator("Anuj",2));
        list.add(new StudentUsingComparator("Ramesh",4));
        list.add(new StudentUsingComparator("Shivam",3));
        list.add(new StudentUsingComparator("Gitesh",1));

        System.out.println("Before Sorting (Using Comparator) list = " + list);

//        Collections.sort(list, new Comparator<StudentUsingComparator>() {
//            @Override
//            public int compare(StudentUsingComparator o1, StudentUsingComparator o2) {
//                // +ve then o1 > o2
//                // -ve then o2 > o1
//                // 0 then o1 equal to o2
//                return o1.name.compareTo(o2.name);
//            }
//        });

        // Using Lambda functions
        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("After sorting list = " + list);
    }
}
