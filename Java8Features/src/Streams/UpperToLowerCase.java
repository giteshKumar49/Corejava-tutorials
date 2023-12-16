package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {
    public static void main(String[] args) {
        // USING .map() method
        List<String> l1 = new ArrayList<>();
        l1.add("GITESH");
        l1.add("SUMIT");
        l1.add("JoHN");
        System.out.println("l1 = " + l1);

        List<String> l2 =  l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println("l2 = " + l2);

    }
}
