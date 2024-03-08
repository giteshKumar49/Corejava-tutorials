package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        // ----------------------------------ARRAY LIST---------------------------------------------//
        // NOTE: if we replace ArrayList class with linkedList class then also it will not affect anything
        //       as both are implementing List interface. So we get all the functionalities.

        // Internally use array and will increase it automatically, we don't need to specify size.
        // And actually what the below line does is that it will create an empty array for use.


        //  ArrayList<String> studentNames = new ArrayList<>();
        List<String> studentNames = new LinkedList<>();

        // Now, say currently the size of the array is n ie. it can hold n elements only, and now we are
        // trying to add one more element into it then it will be the time to increase the size of array,
        // So the size will become n + n/2 + 1;

        // ie. initial size = n --> new size = n + n/2 + 1
        // This is how size of the array will increase internally....ie. A new array of size n + n/2 + 1 will
        // be created and old data will be copied to new array of new size, and old array is DUMPED.
        // (Don't need to know much but it is good to have some idea 😉)

        studentNames.add("Rakesh");

        System.out.println("studentNames = " + studentNames);

        // 1. Adding elements to the list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list = " + list);

        list.add(4); // This will add 4 at the end of the list...
        System.out.println("list = " + list);

        list.add(1,50); // This will add 50 at index 1 (0 based indexing) list = [1,50,2,3,4]
        System.out.println("list = " + list);

        List<Integer> newList = new ArrayList<>();
        newList.add(20);
        newList.add(30);

        System.out.println("newList = " + newList); // newList = [20, 30]

        list.addAll(newList); // Add the newly created list into the existing list , list = [1, 50, 2, 3, 4, 20, 30]

        System.out.println("list = " + list);


        // 2. Getting for the list
        System.out.println("list.get(1) = " + list.get(1)); // only retrieves the element but don't remove it.
        System.out.println("list = " + list);

        // 3. Removing for list
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        System.out.println("list1 = " + list1); // list1 = [10, 20, 30, 40, 50, 60, 70, 80]
        System.out.println("Before removal -> list1.size() = " + list1.size());

        list1.remove(1); //removes element on index 1 from the list: list1 = [10, 30, 40, 50, 60, 70, 80]
        System.out.println("list1 = " + list1);

        System.out.println("After removal -> list1.size() = " + list1.size());

        list1.remove(Integer.valueOf(40)); // removes the specific type of element from the list
        System.out.println("list1 = " + list1);
        
        list1.clear();  // removes all the elements for the list
        System.out.println("list1 = " + list1);

        // 4. Updating elements on the list

        System.out.println("Before -> list = " + list); // Before -> list = [1, 50, 2, 3, 4, 20, 30]
        list.set(2, 1000);  // set the value of index 2 to 1000

        System.out.println("After setting at index 2 -> list = " + list); //After setting at index 2 -> list = [1, 50, 1000, 3, 4, 20, 30]

        System.out.println("list1.contains(200) = " + list1.contains(200)); // returns true of false on whether element is in the list or not..


        // 5. Traversing the list
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        System.out.println("list2 = " + list2);

        for(int i = 0; i < list2.size(); i++) {
            System.out.println("list2.get(i) = " + list2.get(i));
        }

        // Recommended.
        for(Integer element: list2) {
            System.out.println("for each element = " + element);
        }


        // -----------------------------------------------ITERATOR---------------------------------------------//

        // iterator gives us an iterator and has methods like .hasNext() -> it tells if there is any next element or not
        // and .next() will give the value..
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }


    }
}
