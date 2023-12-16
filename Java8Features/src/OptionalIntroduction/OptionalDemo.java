package OptionalIntroduction;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Null reference checks are done in almost every application , to overcome this problem
        // in JAVA8 introduces a Container called as OPTIONAL.
        // This container will contain a value if value is present of else it will be empty, so this
        // makes the checking of null easy, we can just check that if it is empty or not
        // and we are all set and now no need to fill our code with lots of null checks.

        Optional<String> empty = Optional.empty(); // To make an empty optional object
        System.out.println(" IsPresent = " + empty.isPresent()); // .isPresent is used to check
        // is anything is there in the container or not.

        Optional<String> data = Optional.of("Optional but very useful");
        System.out.println("data.isPresent() = " + data.isPresent());

        //.get() method will get the data or if it is empty then Exception is thrown
        System.out.println("data.get() = " + data.get());
        //System.out.println("empty = " + empty.get());// java.util.NoSuchElementException: No value present

        // So always do a check like below
        if(empty.isPresent()) {
            System.out.println(empty.get());
        }

        // filer and orElse methods
        // filer: will return an optional object is the value is evaluated as Ture or it will give empty optional
        //        object.
        System.out.println(data.filter(s->s.equals("Hello")));// output: Optional.empty

        System.out.println(data.filter(s->s.equals("Optional but very useful")));

        // orElse : this method will return the value of optional object if it is present
        //          but if it is not present then it will give us the value we specify to it.
        System.out.println(data.orElse("Default value"));
        System.out.println(empty.orElse("Default value"));


        // ifpresent() method : if value is present the it performs the operation you supply to it
//      //                          or else it will do nothing..

        data.ifPresent(System.out::println);// out: Optional but very useful
        empty.ifPresent(System.out::println);// nothing is printed
    }
}
