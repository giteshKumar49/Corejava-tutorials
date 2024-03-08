package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        // SET --> duplicate elements are not ALLOWED
        // internally hashing is being done here ie. for each element a unique Hash value is generated and then
        // corresponding to it the values are stored...so no repeated values are stored.

        Set<Integer> set = new TreeSet<>();
        // In TreeSet elements will be UNIQUE and will be having sorted format as it internally uses BINARY SEARCH TREE.

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println("set = " + set);

        set.remove(65);
        System.out.println("set = " + set);

        System.out.println("set.contains(100) = " + set.contains(100));
        System.out.println("set.contains(21) = " + set.contains(21));

        System.out.println("set.isEmpty() = " + set.isEmpty());

        set.clear(); // remove all elements of set.
        System.out.println("set = " + set);
    }
}
