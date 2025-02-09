import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9, 9, 9};
        boolean t = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                t = false;
            }
        }


        int[] newarr = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {

        }

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        int a = 0;
//        for (int i=0;i<arr.size();i++){
//            if (arr/2 == arr2){
//            // }
//        }


//        List<String> arrr = List.of("Əli","Sənubər","Lalə","Rəvan","Mura","İbo","Rəna","Amil","Anor","Aysu","Toğrul","Vüsal","Fakhri Babayev",null,null);
//        arrr.parallelStream()
//                .mapToInt(Integer::intValue).

        // arrr.stream().filter(element -> arrr.).

//        List<Integer> arr1 = (List<Integer>) IntStream.rangeClosed(1, 100).boxed().filter(num -> num % 3 == 0 && num % 5 == 0).map(num -> num * num).forEach(System::toString);
//
    }
}