package Leetcode;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (0 <= m || m <= 200 || 0 <= n || n <= 200) {
            if (1 <= m + n || m + n <= 200) {

                for (int i = 0; i < n; i++) {
                    nums1[m + i] = nums2[i];
                }
            }
        }
        java.util.Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }
}
