package cheatsheet;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheatSheet {
    public static void main(String[] args) {
        int[] myIntArray = {1, 4, 6, 2, 8, 2, 8, 2, 8};
        int myInt = 12345;
        String myString = "My String";
        /**
         * ARRAY
         * 
         */
        // print an array
        System.out.println("print an array " + Arrays.toString(myIntArray));
        // [1, 4, 6, 2, 8, 2, 8, 2, 8]

        /**
         * STREAM
         */
        // Create Stream from array
        Stream<int[]> stream = Stream.of(myIntArray);
        IntStream stream2 = Arrays.stream(myIntArray);

        // Get unique (distinct) element from Array using stream
        int[] uniqueNumbers = Arrays.stream(myIntArray).distinct().toArray();
        System.out.println("uniqueNumbers: " + Arrays.toString(uniqueNumbers));
        // [1, 4, 6, 2, 8]

        // Array filter using streams
        int[] arrayWithEachElementLessThanFive = Arrays.stream(myIntArray).filter(arrivalTime -> arrivalTime < 5).toArray();
        System.out.println("Array filter" + Arrays.toString(arrayWithEachElementLessThanFive));
        // [1, 4, 2, 2, 2]

        // Maximum number for integer ins array
        int maxOfAnArray = IntStream.of(myIntArray).summaryStatistics().getMax();
        System.out.println("Maximum number for integer array" + maxOfAnArray);// 8

        /**
         * STRING
         * 
         */
        // How to count a particular character in a string
        long count = myString.chars().filter(ch -> ch == 't').count();
        System.out.println("count chara:" + count); // 1

        // Integer to String
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(myInt));
        System.out.println("Integer to String: s" + stringBuilder);
        // 12345 - string

        // reversing string
        String reverseString = stringBuilder.reverse().toString();
        System.out.println("reversing string: " + reverseString);
        // 54321 - string

        // string to integer
        int stringToInteger = Integer.parseInt(reverseString);
        System.out.println("string to integer: " + stringToInteger);
        // 54321- number

    }
}
