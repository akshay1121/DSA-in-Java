class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0;
        
        for(int num : costs){
            if(coins<num)
            break;
            if(coins!=0){
                c++;
                coins-=num;
            }
        }
            return c;
        
    }
}