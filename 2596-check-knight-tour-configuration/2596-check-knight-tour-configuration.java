class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0){
            return false;
        }
        int [][]pos = new int [n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val = grid[i][j];
                pos[val][0]=i;
                pos[val][1]=j;
            }
        }
        for(int i=0;i<n*n-1;i++){
            int r1=pos[i][0];
            int c1=pos[i][1];
            
            int r2= pos[i+1][0];
            int c2=pos[i+1][1];

            int rd = Math.abs(r2-r1);
            int cd= Math.abs(c2-c1);
            if(!((rd ==2 && cd ==1) || (rd == 1 && cd == 2))){
                return false;
            }
        }
        return true;
    }
}