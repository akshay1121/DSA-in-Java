class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=0;
        int a=num;
        while(num>0){
            int d=num%10;
            n=n*10+d;
            num=num/10;
        }
        int g=0;
        while(n>0){
            int v=n%10;
            g=g*10+v;
            n=n/10;
        }
        if(g==a){
            return true;
        }else{
            return false;
        }
    }
}