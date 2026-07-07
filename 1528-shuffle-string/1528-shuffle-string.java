class Solution {
    public String restoreString(String s, int[] indices) {
        // StringBuilder sc = new StringBuilder(s);
        // for(int i=0;i<s.length();i++){
        //     sc.setCharAt(indices[i],s.charAt(i));
        // }
        // return sc.toString();
        HashMap <Integer,Character> sc = new HashMap<>();
        for(int i=0;i<s.length();i++){
            sc.put(indices[i],s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(sc.get(i));
        }
        return sb.toString();
    }
}