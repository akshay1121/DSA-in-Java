class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer ,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxfre = 0;
        for(int fre: map.values()){
            maxfre=Math.max(maxfre,fre);
        }
        int ans=0;
        for(int fre : map.values()){
            if(fre == maxfre){
                ans+=fre;
            }
        }
        return ans;
    }
}