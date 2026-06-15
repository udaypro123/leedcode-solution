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
        
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q=  new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> res= new ArrayList<>();
            while(size > 0){
               Node node = q.poll();
               res.add(node.val);
               for(Node child: node.children){
                 if(child != null){
                    q.offer(child);
                 }
               }
               size--;
            }
            ans.add(res);
        }
     return ans;
        
    }
}