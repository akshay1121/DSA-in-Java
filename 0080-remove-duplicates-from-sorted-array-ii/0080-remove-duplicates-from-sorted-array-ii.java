class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num:nums){
           int count = map.getOrDefault(num,0);
           if(count<2){
            nums[c++]=num;
            map.put(num,count+1);
           }
        }
        return c;

    }
}