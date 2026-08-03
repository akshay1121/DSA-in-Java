class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList <Integer> arr = new ArrayList<>();
        for(int ch:nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==1){
                arr.add(num);
            }
        }
        int c = arr.size();
        int [] ans = new int [c];
        for(int i=0;i<c;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}