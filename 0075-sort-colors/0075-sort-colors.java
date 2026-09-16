class Solution {
    public void sortColors(int[] nums) {
      int c=0;
      int a=0;
      int b=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            c++;
        }
        if(nums[i]==1){
            a++;

        }
        if(nums[i]==2){
            b++;
        }
      }
      int j=0;
      for(int i=0;i<c;i++){
        nums[j++]=0;
      }
       for(int i=0;i<a;i++){
        nums[j++]=1;
      }
       for(int i=0;i<b;i++){
        nums[j++]=2;
      }
    }
}