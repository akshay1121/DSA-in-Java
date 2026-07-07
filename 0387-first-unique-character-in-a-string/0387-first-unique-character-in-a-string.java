class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> sb = new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        sb.put(ch,sb.getOrDefault(ch,0)+1);
       }
       for(int i=0;i<s.length();i++){
        if(sb.get(s.charAt(i))==1){
            return i;
        }
       }
        return -1;

    }
}