package FunctionDemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = s->s.length(); // this function wil take a string and give its
                                                     // length

        System.out.println(f.apply("Gitesh"));
        System.out.println(f.apply("Hi"));

    }
}
