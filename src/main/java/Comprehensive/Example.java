package Comprehensive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {

    public static Supplier<List<Integer>> generateRandomList = () -> {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    };

    public static Predicate<Integer> isEven = num -> num % 2 == 0;

    public static Predicate<Integer> isGreaterThanThreshold(int threshold) {
        return num -> num > threshold;
    }

    public static Consumer<Integer> printElement = System.out::println;

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> condition) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public static Runnable executeProgramLogic = () -> {
        List<Integer> numbers = generateRandomList.get();
        List<Integer> filteredNumbers = filterList(numbers, isEven);
        filteredNumbers = filterList(filteredNumbers, isGreaterThanThreshold(50));
        System.out.println("Filtered list:");
        filteredNumbers.forEach(printElement);
        System.out.println("\nSquared values:");
        for (Integer number : filteredNumbers) {
            int squared = calculateSquare(number);
            System.out.println(squared);
        }
    };

    public static void main(String[] args) {
        executeProgramLogic.run();
    }



}
