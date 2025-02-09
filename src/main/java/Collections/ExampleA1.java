package Collections;

import java.util.*;

public class ExampleA1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // List interfeysi ← ArrayList klası
        list.add("A");

        Set<Integer> set = new HashSet<>();    // Set interfeysi ← HashSet klası
        set.add(10);

        Queue<String> queue = new LinkedList<>(); // Queue interfeysi ← LinkedList klası
        queue.offer("Task1");

        Map<String, Integer> map = new HashMap<>(); // Map interfeysi ← HashMap klası
        map.put("Key", 100);
    }
}
