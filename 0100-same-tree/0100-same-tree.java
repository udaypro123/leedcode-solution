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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    Queue<TreeNode> queue = new  LinkedList<>();
queue.offer(p);
queue.offer(q);

while(!queue.isEmpty()){
    TreeNode curr1 = queue.poll();
    TreeNode curr2 = queue.poll();

    if(curr1 == null && curr2 == null) continue;
    if(curr1 == null || curr2 ==null  || curr1.val != curr2.val) return false;

    queue.offer(curr1.left);
    queue.offer(curr2.left);
    queue.offer(curr1.right);
    queue.offer(curr2.right);
}
return true;
        
    }
}