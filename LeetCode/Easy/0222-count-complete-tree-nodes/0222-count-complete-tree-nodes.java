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
   
    public int countNodes(TreeNode root) {
        
        int []nodes = {0};
        findNodes(root, nodes);
        return nodes[0];
    }

    public void findNodes(TreeNode root, int[] nodes)
    {
        if(root == null) return;

        findNodes(root.left, nodes);
        nodes[0] += 1;
        findNodes(root.right, nodes);

    }
}