package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        // This Arrays class deals with normal arrays that we make...

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(numbers, 4);
//        System.out.println("After binary search of 4 -> index = " + index);

        Integer[] numbers = {10,2,32,12,15,76,48,79,99};
        Arrays.sort(numbers);
        
        for(int i: numbers) {
            System.out.println("i = " + i);
        }

        Arrays.fill(numbers, 13); // Fills all the values in numbers with 12
        
        for (int i: numbers) {
            System.out.println("i = " + i);
        }
    }
}
