class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] ch = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }

        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(0,ch,ans);
        return ans;

    }
    private static void nqueen(int row,char [][] ch,List<List<String>> ans ){
        int n = ch.length;
        if(row==n){
            List<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
               list.add(new String(ch[i]));
            }
              ans.add(list);
              return;
        }
        for(int col=0;col<n;col++){
            if(queen(row,col,ch)){
                ch[row][col]='Q';
                nqueen(row+1,ch,ans);
                ch[row][col]='.';
            }
        }
    }
    private static boolean queen(int row,int col,char [][]ch){
        int n = ch.length;
        int i=row-1;
        while(i>=0){
            if(ch[i][col]=='Q')return false;
            i--;
        }
        i = row-1;
        int j = col-1;
        while(i>=0 && j>=0){
            if(ch[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i = row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(ch[i][j]=='Q'){
                return false;
            }
            i--;
            j++;

        }
        return true;
    }
}