package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OtherMethodsOnstream {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            l1.add(i);
        }

        List<Integer> collect =  l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        long countAllEvens = l1.stream().filter(i->i%2 == 0).count();
        System.out.println("countAllEvens = " + countAllEvens);

        List<Integer> unsortednumbers  = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            unsortednumbers.add(r.nextInt(100));
        }
        System.out.println("unsortednumbers = " + unsortednumbers);


        Comparator<Integer> compAscending = (a,b)->(a.compareTo(b)); //Ascending order
        Comparator<Integer> compDescending = (a,b)->(b.compareTo(a)); //Ascending order


        List<Integer> sortedNumbers = unsortednumbers
                .stream()
                .sorted(compAscending)
                .collect(Collectors.toList());
        System.out.println("sortedNumbers = " + sortedNumbers);

        // NOTE: min max mei comparator dena mandatory hai
        Integer maximum = unsortednumbers.stream().max(compAscending).get();
        System.out.println("maximum = " + maximum);

        Integer minimum = unsortednumbers.stream().min(compAscending).get();
        System.out.println("minimum = " + minimum);

        //foreach(lambda exp) --> foreach will apply the lambda expression to all the elements
        //                        of the stream.
        sortedNumbers.stream().forEach(i-> System.out.println(i));




        List<String> l2 = new ArrayList<>();
        l2.add("GITESH");
        l2.add("SUMIT");
        l2.add("JoHN");
        System.out.println("l2 = " + l2);

        List<String> l3 =  l2.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println("l2 = " + l3);

    }
}
