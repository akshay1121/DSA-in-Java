class Solution {
    public String getEncryptedString(String s, int k) {
        int n= s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt((i+k)%n));
        }
        return sb.toString();
    }
}