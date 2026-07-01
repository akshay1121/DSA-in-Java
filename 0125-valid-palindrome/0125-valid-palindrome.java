class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder b= new StringBuilder(s);
        String rev=b.reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}