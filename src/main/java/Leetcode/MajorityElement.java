package Leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int count2 = 0;
        int numi = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > count2) {
                count2 = count;
                numi = nums[i];
            }
        }
        return numi;
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        int count2 = 0;
        int numi = 0;
        int i = 0;

        while (i < nums.length) {
            count = 0;
            int j = i ;

            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                j++;
            }

            if (count > count2) {
                count2 = count;
                numi = nums[i];
            }

            i++;
        }

        return numi;
    }
}
