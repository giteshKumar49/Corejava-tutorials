package Predicate;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> p = s->(s.length()>5);
        System.out.println("p.test(\"Gitesh\") = " + p.test("Gitesh"));
        System.out.println("p.test(\"Git\") = " + p.test("Git"));
    }
}
