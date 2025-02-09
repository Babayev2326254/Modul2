package Collectiondemo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylistdemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list1.add("A");
        list1.add("B");

        list2.add("C");
        list2.add("D");


        System.out.println(list1);

        list1.get(0);
        System.out.println(list1.get(0));
        System.out.println(list2);
        System.out.println(list2.get(0));


    }
}
