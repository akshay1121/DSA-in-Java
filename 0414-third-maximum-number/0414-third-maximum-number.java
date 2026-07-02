class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sec && nums[i] < max) {
                sec = nums[i];
            }
        }
        if (sec == Long.MIN_VALUE) {
            return (int) max;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > third && nums[i] < sec) {
                third = nums[i];
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) third;
    }
}