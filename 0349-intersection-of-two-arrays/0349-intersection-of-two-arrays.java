class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
         HashSet<Integer> b = new HashSet<>();
         for(int i : nums1){
            a.add(i);
         }
         for(int i:nums2){
            if(a.contains(i)){
                b.add(i);
            }
         }
         int [] ans = new int [b.size()];
         int i=0;
         for(int num:b){
            ans[i++]=num;
         }
         return ans;
    }
}