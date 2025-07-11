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
    public TreeNode convertBST(TreeNode root) {
        
        int[] nums = {0};
        inorderRev(root, nums);
        return root;
    }

    // Reverse inorder traversal - Right Root Left
    public void inorderRev(TreeNode root, int[] sum)
    {
        if(root == null) return;

        inorderRev(root.right, sum);        // right call
        root.val = root.val + sum[0];       // self work
        sum[0] = root.val;
        inorderRev(root.left, sum);         // left call
    }
}