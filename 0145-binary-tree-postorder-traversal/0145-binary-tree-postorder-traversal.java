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
    List <Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> st = new Stack<>();
       TreeNode node=root;

       while(node != null || !st.isEmpty()){
            while(node != null){
                st.push(node);
                node= node.left;
            }

            if(st.peek().right != null){
                node = st.peek().right;
            }else{
                TreeNode temp = st.pop();
                result.add(temp.val);
                while(!st.isEmpty() && temp == st.peek().right){
                    temp = st.pop();
                    result.add(temp.val);
                }
            }
       }

        return result;
        
    }
}