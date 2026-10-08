class Solution {
    public int[] sortedSquares(int[] nums) {
    
        for(int i=0;i<nums.length;i++){
            int n=0;
            n=nums[i]*nums[i];
            nums[i]=n;
        }
        Arrays.sort(nums);
        return nums;
    }
}