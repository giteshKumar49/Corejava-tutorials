package DiffBetweenComparableAndComparator.Comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeImplementsComparator> {
    @Override
    public int compare(EmployeeImplementsComparator o1, EmployeeImplementsComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
