package Maps;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        // All operations are performed in O(1) time

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        System.out.println("numbers = " + numbers);
        numbers.put("Two",28); // By default if we try to insert a value with same key the value is updated

        System.out.println("numbers = " + numbers); //numbers = {One=1, Two=28, Three=3}

        // now if we want to prevent this behaviour then we can apply an if check to prevent it.
        if(!numbers.containsKey("Two")) {
            numbers.put("Two",222);
        }

        // OR

        numbers.putIfAbsent("Two",234); // Put if Key is absent.....ie. VALUE WILL NOT OVERRIDE.

        System.out.println("numbers = " + numbers); // numbers = {One=1, Two=28, Three=3}

        // Iterating over a MAP
        // Entry will give the full map element
        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println("e : " + e);
        }

        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.print("e.getKey() : " + e.getKey());
            System.out.println(" --> e.getValue() = " + e.getValue());
            
        }

        System.out.println("numbers.keySet() = " + numbers.keySet()); // gives only the Key Set of the map
        System.out.println("numbers.values() = " + numbers.values()); // gives only the values of the key

        System.out.println("numbers.containsValue(3) = " + numbers.containsValue(3));

        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

        numbers.clear();
        System.out.println("numbers = " + numbers);

    }
}
