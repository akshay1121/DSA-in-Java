class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long a =1;
        long c=0;
        while(n>0){
            long d = n%10;
            c=c+d;
            if(d!=0){
              x=d* a+x; 

              a=a*10;
            }
            n=n/10;

            
        }
        return x*c;
    }
}