class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int max=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
         for(int i=0;i<nums.length;i++){
            if(m < nums[i] && nums[i]<max){
                m=nums[i];
            }
        }
        return m;
    }
}