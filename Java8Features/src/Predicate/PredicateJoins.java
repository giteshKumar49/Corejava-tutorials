package Predicate;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int []x = {0,7,10,20,30,40,50,60,70,73};

        Predicate<Integer> p1 = i->(i>10);
        Predicate<Integer> p2 = i->i%2==0;

//        System.out.println("greaterthan 10: ");
//        method1(p1,x);

//        System.out.println("even numbers: ");
//        method1(p2,x);

//        System.out.println("Not Greater that 10 : ");
//        method1(p1.negate(),x); // negate will act as NOT operator or negation

//        System.out.println("greater than 10 AND even : ");
//        method1(p1.and(p2),x);

        System.out.println("greater than 10 OR even : ");
        method1(p1.or(p2),x);
    }
    static void method1(Predicate<Integer> p, int[]x) {
        for(int eachValue: x) {
            if(p.test(eachValue)) {
                System.out.print(eachValue + " ");

            }
        }
        System.out.println();
    }
}
