package Genericlearn;

import java.util.List;


public class UpperBoundedWildcard {

    public static void main(String[] args) {

    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
}
