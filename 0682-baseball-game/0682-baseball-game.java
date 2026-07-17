class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer>  s = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                s.pop();
            }else if(op.equals("D")){
                s.push(2*s.peek());
            }else if (op.equals("+")){
                int first = s.pop();
                int sec= s.peek();
                int sum = first+sec;
                s.push(first);
                s.push(sum);
            }
            else{
                s.push(Integer.parseInt(op));
            }
        }
            int ans=0;
            while(!s.isEmpty()){
                ans+=s.pop();
            }
        
            return ans;
        
    }
}