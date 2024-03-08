package DiffBetweenComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparable {
    public static void main(String[] args) {
        List<EmployeeImplementsComparable> emps = new ArrayList<>();
        emps.add(new EmployeeImplementsComparable("Durgesh","321421153",12));
        emps.add(new EmployeeImplementsComparable("Ankit","3246",11));
        emps.add(new EmployeeImplementsComparable("Bhavesh","977",45));

        System.out.println("Before Sorting emps = " + emps);

        Collections.sort(emps);
        System.out.println("After Sorting emps = " + emps);
    }
}
