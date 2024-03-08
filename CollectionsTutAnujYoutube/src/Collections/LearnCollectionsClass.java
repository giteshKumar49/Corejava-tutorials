package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("Minimum in the list = " + Collections.min(list));
        System.out.println("Maximum in the list = " + Collections.max(list));
        System.out.println("Frequency of 9 in the list = " + Collections.frequency(list,9));

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("list after reversing sorting order= " + list);

    }
}
