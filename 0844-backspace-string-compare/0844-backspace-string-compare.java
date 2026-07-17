class Solution {
    public boolean backspaceCompare(String s, String t) {
  
        Stack <Character> sb = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(ch=='#'){
                if(!sb.isEmpty()){
                sb.pop();
                }
            }else{
                sb.push(ch);
            }
        } 
        StringBuilder b = new StringBuilder();
        while(!sb.isEmpty()){
            char x = sb.pop();
            b.append(x);
        }
        b.reverse();
         Stack <Character> st =new Stack<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#'){
                if(!st.isEmpty()){
                st.pop();
                }

            }else{
                st.push(c);
            }
        }
        StringBuilder n = new StringBuilder();
        while(!st.isEmpty()){
            char m = st.pop();
            n.append(m);
        }
        n.reverse();
        if(n.toString().equals(b.toString())){
            return true;
        }
        return false;
    }
}