class Solution {
    public int maxProduct(int[] nums) {
        int a=nums[0];
        int b=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>a){
            a=nums[i];
            d=i;
        }
        }
         for(int i=0;i<nums.length;i++){
        if(nums[i]>b && nums[i]<=a && i!=d){
            b=nums[i];
        }
        }
        int c=(a-1)*(b-1);
        return c;
    }
}