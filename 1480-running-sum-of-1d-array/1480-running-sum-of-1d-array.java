class Solution {
    public int[] runningSum(int[] nums) {
        int c=0;
        int []a = new int [nums.length];
        for(int i=0;i<nums.length;i++){
         c+=nums[i];
         a[i]=c;
        }
        return a;
    }
}