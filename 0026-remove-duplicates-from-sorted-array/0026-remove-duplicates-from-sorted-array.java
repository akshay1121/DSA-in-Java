class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> sc = new LinkedHashSet<>();
        for(int num:nums){
            sc.add(num);
        }
        int i=0;
        for(int num:sc){
            nums[i++]=num;
        }
        return sc.size();
    }
}