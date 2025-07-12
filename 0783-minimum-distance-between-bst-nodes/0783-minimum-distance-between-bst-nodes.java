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
    public int minDiffInBST(TreeNode root) {

        // Made 1 sized array for passing values by reference instead of making global variables. 
        int[] minDiff = {Integer.MAX_VALUE};
        TreeNode[] prev = {null};

        inorder(root, prev, minDiff);
        return minDiff[0];
    }

    public void inorder(TreeNode root, TreeNode[] prev, int[] minDiff)
    {
        if(root == null) return;

        inorder(root.left, prev, minDiff);      // left

        if(prev[0] != null)                        // Self work
        {
            TreeNode temp = prev[0];
            int diff = Math.abs(root.val - temp.val);
            minDiff[0] = Math.min(minDiff[0], diff);
        }
        prev[0] = root;

        inorder(root.right, prev, minDiff);     // right
    }
}