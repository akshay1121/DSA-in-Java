class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sb = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!sb.isEmpty() && sb.peek()==ch){
                sb.pop();
            }else{
                sb.push(ch);
            }
        }
        StringBuilder c = new StringBuilder();
        while(!sb.isEmpty()){
            char x=sb.pop();
            c.append(x);
        }
        return c.reverse().toString();

    }
}