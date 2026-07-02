class Solution {
    public int addDigits(int num) {
        
        while(num>=10){
            int c=0;
            while(num>0){
            int d = num%10;
            c=c+d;
            num/=10;
            }
            num=c;
            
        }
        
        return num;
    }
}