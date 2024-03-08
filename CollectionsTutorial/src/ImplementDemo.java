import java.util.*;

public class ImplementDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Collection Framework Demo");
        System.out.println("------------------------------------------");

        //1. Creating Collection : There are mainly two ways to create collections
        //   a) Type Safe - same type of elements(objects) are added to collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Gitesh");
        list.add("kumar");
        System.out.println("list = " + list);
        //list.add(123); // ERROR

        //   b) Un type safe - Different types of elements cna be added to the collection
        ArrayList list2 = new ArrayList();
        list2.add("Hello");
        list2.add("World");
        list2.add(1234);
        list2.add(123.456);
        list2.add(true);
        System.out.println("list2 = " + list2);

        LinkedList linkedList = new LinkedList();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add(1234);
        linkedList.add(123.456);
        linkedList.add(true);
        System.out.println("linkedList = " + linkedList);


        // Exploring some methods in type safe one (We will use the type safe ones only)
        List<String> list3 = new ArrayList<>();
        list3.add("Gitesh");
        list3.add("Kumar");
        list3.add("Cognizant");
        list3.add("Think Future Technologies");
        System.out.println("list3 = " + list3);
        System.out.println("list3.size() = " + list3.size());

        list3.remove("Kumar"); // removes a full object or element from the collection
        System.out.println("list3 = " + list3);
        
        list3.remove(2); // the string "Think Future Technologies" will be removed"

        System.out.println("list3 = " + list3);
        System.out.println("list3.size() = " + list3.size());

        // Check for one element in the collection that whether its is present or not..
        System.out.println("list3.contains(\"Gitesh\") = " + list3.contains("Gitesh"));


        // To check for multiple elements use containsAll method
        List<String> cmp = new ArrayList<>();
        cmp.add("Gitesh");
        cmp.add("Cognizantr");
        System.out.println("list3.containsAll() = " + list3.containsAll(cmp));

        // Check if the collection isEmpty or not
        System.out.println("list3.isEmpty() = " + list3.isEmpty());

        // for-each demonstration
        list3.forEach(name -> System.out.println(name));
        list3.forEach(System.out::println);

        // adding into collection (it increases the length)
        list3.add(1,"Qwerty");
        System.out.println("list3 = " + list3);

        // replacing into the existing value collection
        System.out.println("Before (list3) = " + list3);
        list3.set(1,"Sumit");
        System.out.println("After (list3) = " + list3);

        list3.add(3,"asdf");
        System.out.println("list3 = " + list3);
        
        // Remove all the elements
//        list3.clear();
//        System.out.println("list3 = " + list3);


        // 2. VECTOR

        Vector<String> v = new Vector<>();
        v.addAll(list3);
        System.out.println("VECTOR v contains = " + v);

        // 3. SET
        System.out.println("-------------------------------------------------------------");

        Set<Double> nums = new HashSet<>();
        nums.add(14.14);
        nums.add(34.1234);


    }
}
