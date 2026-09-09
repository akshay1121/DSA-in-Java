class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for(int n:nums){
            t=t+n;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=t-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}