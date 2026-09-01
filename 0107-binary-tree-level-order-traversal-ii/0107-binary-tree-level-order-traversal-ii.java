/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue <TreeNode > s = new LinkedList<>();
        List<List<Integer>> a = new ArrayList<>();
        if(root==null){
            return a;
        }
        s.offer(root);
        while(!s.isEmpty()){
            int len = s.size();
            List<Integer> sc = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode n = s.poll();
                sc.add(n.val);
                if(n.left!=null){
                    s.offer(n.left);
                }
                if(n.right!=null){
                    s.offer(n.right);
                }
            }
        
            a.add(sc);
    }
            Collections.reverse(a);
            return a;

        
    }
}