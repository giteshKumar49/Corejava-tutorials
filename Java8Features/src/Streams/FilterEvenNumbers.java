package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println("l1 = " + l1);

        // First WAY
        List<Integer> l2 = new ArrayList<>();
        for(Integer i: l1) {
            if(i%2 == 0) {
                // even number
                l2.add((i));
            }
        }
        System.out.println("l2 = " + l2);

        // Second WAY using Streams
        // .stream() method will  give us a strea
        // then we have to configure our stream and to do that we can
        // use Predicate or Function, here we are using Predicate to filter out
        // the even numbers and then we collect them using Collectors, and using
        // collectors we can put the data in new list, set, mat etc.......
        //
        // USING .filter() method --> it takes a predicate as input
        List<Integer> collect =  l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("collect = " + collect);



    }
}
