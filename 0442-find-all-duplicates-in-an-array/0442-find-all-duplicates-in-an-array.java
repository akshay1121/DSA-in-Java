class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
     List<Integer> ans = new ArrayList<>();
        for(int ch:nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      
        for(int ch :map.keySet()){
            if(map.get(ch)>1){
                ans.add(ch);
            }
        }
        return ans;
    }
}