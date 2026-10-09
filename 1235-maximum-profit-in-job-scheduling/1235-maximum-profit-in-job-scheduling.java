class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int [][]job = new int [n][3];
        for(int i=0;i<n;i++){
            job[i][0]=startTime[i];
            job[i][1]=endTime[i];
            job[i][2]=profit[i];
        }
        Arrays.sort(job,(a,b)->a[1]-b[1]);
        int []dp=new int [n];
        dp [0] = job[0][2];
        for(int i=1;i<n;i++){
            int cp = job[i][2];
            int low = 0;
            int high = i-1;
            int last = -1;
            while(low<=high){
                int mid = low +(high-low)/2;
                if(job[mid][1]<=job[i][0]){
                    last = mid;
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            if(last!=-1){
                cp+=dp[last];
            }
            dp[i]= Math.max(dp[i-1],cp);
        }
        return dp[n-1];
    }
}