import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {


        int[] arr = {3, 2, 1, 6, 4, 5};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }
        int mid = n / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }
        int j = 0;
        for (int i = mid; i < n; i++) {
            arr2[j++] = arr[i];
        }

        return sort(mergesort(arr1),mergesort(arr2));
    }

    public static int[] sort(int[] arr1, int[] arr2) {
        int[] arrmerge = new int[arr1.length + arr2.length];
        int i = 0, j=0 ,k = 0;
        while (i < arr1.length  && j <arr2.length) {
            if (arr1[i] > arr2[j]) {
                arrmerge[k++] = arr2[j++];
                System.out.println("NW"+Arrays.toString(arrmerge));
            } else if (arr1[i] < arr2[j]) {
                arrmerge[k++] = arr1[i++];
                System.out.println("NW"+Arrays.toString(arrmerge));
            }
            else if(arr1[i]==arr2[j]){
                arrmerge[k++] = arr2[j++];
                arrmerge[k++] = arr1[i++];
            }

        }
        while (i<arr1.length){
            arrmerge[k++] = arr1[i++];
        }
        while (j<arr2.length){
            arrmerge[k++] = arr2[j++];
        }
     return arrmerge;
    }
}