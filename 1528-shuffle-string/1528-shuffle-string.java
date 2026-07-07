class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sc = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sc.setCharAt(indices[i],s.charAt(i));
        }
        return sc.toString();
    }
}