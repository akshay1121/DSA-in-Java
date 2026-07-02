class Solution {
    public boolean rotateString(String s, String goal) {
        String c = s+s;
        if(c.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}