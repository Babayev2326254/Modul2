package Binaryserach;

public class Binari {
    public static void binary(int[] arr, int serach, int left, int right) {

        if (left > right) {
            System.out.println("Element tapılmadı!");
            return;
        }
        int l = left + (right - left) / 2;

        if (arr[l] == serach) {
            System.out.println("index nomresi  " + l);
        } else if (arr[l] < serach) {
            left = l + 1;
            binary(arr, serach, l + 1, right);
        } else if (arr[l] < serach) {
            right = l - 1;
            binary(arr, serach, left, l - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 15};
        binary(arr, 10, 0, arr.length - 1);
    }

}
