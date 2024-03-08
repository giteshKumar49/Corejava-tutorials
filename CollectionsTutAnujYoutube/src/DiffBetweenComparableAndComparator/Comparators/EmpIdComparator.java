package DiffBetweenComparableAndComparator.Comparators;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<EmployeeImplementsComparator> {

    @Override
    public int compare(EmployeeImplementsComparator o1, EmployeeImplementsComparator o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}
