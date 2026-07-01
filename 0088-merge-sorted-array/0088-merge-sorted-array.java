class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m+n;
        // int [] arr=new int[m+n];
        // for(int i=0;i<m;i++){
        //     arr[i]=nums1[i];
        // }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        // for(int i=0;i<m+n;i++){
        //     nums1[i]=arr[i];
        // }
    }
}