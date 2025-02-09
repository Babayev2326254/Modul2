package Leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] remove = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                remove[count] = nums[i];
                count++;
            }
        }

        for (int j = 0; j < count; j++) {
            nums[j] = remove[j];
        }

        return count;
    }
}
