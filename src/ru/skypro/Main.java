package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(11, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("train", "ferry", "bus", "car", "plane", "ferry", "plane", "ship", "car"));
        printOddNumbers(nums);
        printEvenNumbers(nums);
        printSingleWords(words);
        numberOfDuplicates(words);
    }

    public static void printOddNumbers(List<Integer> nums) {
        Collections.sort(nums);
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }


    public static void printEvenNumbers(List<Integer> nums) {
        Set<Integer> copyNums = new TreeSet<>(Set.copyOf(nums));
        copyNums.removeIf(number -> number % 2 != 0);
        for (Integer number : copyNums) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void printSingleWords(List<String> words) {
        Set<String> singleWords = new HashSet<>(words);
        List<String> duplicateWords = new ArrayList<>(words);
        for (String singleWord : singleWords) {
            duplicateWords.remove(singleWord);
        }
        singleWords.removeAll(duplicateWords);
        System.out.println(singleWords);
    }


    public static void numberOfDuplicates(List<String> words) {
        Set<String> singleWords = new HashSet<>(words);
        System.out.println(words.size() - singleWords.size());
    }
}
