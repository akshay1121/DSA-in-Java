class Solution {
    public int pivotIndex(int[] nums) {
       int a=0;
       for(int n : nums){
        a+=n;
       }
       int leftsum=0;
       for(int i=0;i<nums.length;i++){
        int rightsum = a-leftsum-nums[i];
        if(rightsum==leftsum){
            return i;
        }
        leftsum +=nums[i]; 
       }
       return -1;
    }
    
}

