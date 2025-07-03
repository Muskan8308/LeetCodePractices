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

    int res = 0;

    private int diameter(TreeNode root)
    {
        if(root == null) return 0;

        int leftAns = diameter(root.left);          // left subtree
        int rightAns = diameter(root.right);          // right subtree
        res = Math.max(res, leftAns + rightAns);        // Diameter = left + right edges
        
        return Math.max(leftAns, rightAns) + 1;           // Return height of current node
    } 

    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0;
        res = 0;
        diameter(root);
        return res;
    }
}