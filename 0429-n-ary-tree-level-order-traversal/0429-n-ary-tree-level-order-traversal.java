/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue <Node> s = new LinkedList<>();
        List<List<Integer>> a = new ArrayList<>();
        if(root==null){
            return a;
        }
        s.offer(root);
        while(!s.isEmpty()){
            int len = s.size();
            List<Integer> sc = new ArrayList<>();
            for(int i=0;i<len;i++){
                Node n = s.poll();
                sc.add(n.val);
                for (Node child : n.children) {
                    s.offer(child);
                }

            }
            a.add(sc);

        }
        return a;
    }
}