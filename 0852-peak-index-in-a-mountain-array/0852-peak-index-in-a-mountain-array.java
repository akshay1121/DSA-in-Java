class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int c=arr[0];
        int v=0;
        for(int i=0;i<arr.length;i++){
            if(c<arr[i]){
                c=arr[i];
                v=i;
            }

        }
        return v;
    }
}