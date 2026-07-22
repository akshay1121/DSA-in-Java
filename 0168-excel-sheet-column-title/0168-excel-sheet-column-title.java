class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sc = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sc.append((char)('A'+columnNumber%26));
            columnNumber/=26;
        }
        return sc.reverse().toString();
    }
    
}