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

    public void inorderRev(TreeNode root, int[] sum)
    {
        if(root == null) return;

        inorderRev(root.right, sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        inorderRev(root.left, sum);
    }
}