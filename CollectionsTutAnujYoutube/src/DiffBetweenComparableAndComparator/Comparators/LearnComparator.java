package DiffBetweenComparableAndComparator.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparator {
    public static void main(String[] args) {
        List<EmployeeImplementsComparator> emps = new ArrayList<>();
        emps.add(new EmployeeImplementsComparator("Durgesh","321421153",12));
        emps.add(new EmployeeImplementsComparator("Ankit","3246",11));
        emps.add(new EmployeeImplementsComparator("Bhavesh","977",45));

        System.out.println("Before Sorting emps = " + emps);

        Collections.sort(emps, new EmpIdComparator());
        System.out.println("After Sorting emps = " + emps);

        List<EmployeeImplementsComparator> emps1 = new ArrayList<>();
        emps1.add(new EmployeeImplementsComparator("Durgesh","321421153",12));
        emps1.add(new EmployeeImplementsComparator("Ankit","3246",11));
        emps1.add(new EmployeeImplementsComparator("Bhavesh","977",45));

        System.out.println("Before Sorting emps1 = " + emps1);

        Collections.sort(emps1, new NameComparator());
        System.out.println("After Sorting emps1 = " + emps1);
    }
}
