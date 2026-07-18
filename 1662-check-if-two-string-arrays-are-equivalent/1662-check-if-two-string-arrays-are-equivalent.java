class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for(String str:word1){
            sb.append(str);
        } 
        for(String s : word2){
            st.append(s);
        }
        return sb.toString().equals(st.toString());
    }
}