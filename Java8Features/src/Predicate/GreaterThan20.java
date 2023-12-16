package Predicate;

import java.util.function.Predicate;

public class GreaterThan20 {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>20); // i > 20 is the implementation for test method
        System.out.println("p.test(23) = " + p.test(23));
        System.out.println("p.test(7) = " + p.test(7));
    }
}
