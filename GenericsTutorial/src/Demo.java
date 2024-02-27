import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        // USING GENERICS
        List<String> list = new ArrayList<>();
        list.add("hello");
        //list.add(123); // Error as list can only contain String type values only

        // WITHOUT USING GENERICS
        List anotherList = new ArrayList();
        anotherList.add("Hello");
        anotherList.add(123);
        anotherList.add(123.134);

        System.out.println("list = " + list);
        System.out.println("anotherList = " + anotherList);

    }
}
