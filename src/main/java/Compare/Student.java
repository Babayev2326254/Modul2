package Compare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Student {

    public static Supplier<List<Integer>> randomlist = () -> {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    };

    public static Predicate<Integer> even = num -> num % 2 == 0;

    public static Predicate<Integer> othernumber(int other) {
        return num -> num > other;
    }



    public static void main(String[] args) {

    }
}
