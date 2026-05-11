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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        InorderTraverasal(root, ans);

        return ans.get(k-1);
        
    }
    public void InorderTraverasal(TreeNode root , List<Integer> list){
        if(root == null) return;
        InorderTraverasal(root.left, list);
        list.add(root.val);
        InorderTraverasal(root.right, list);

    }
}