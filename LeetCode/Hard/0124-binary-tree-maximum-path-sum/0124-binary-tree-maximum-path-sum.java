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

    // static int maxSum;
    public int maxPathSum(TreeNode root) {
        
        int[] maxSum = {Integer.MIN_VALUE};
        lineSum(root, maxSum);
        return maxSum[0];
    }

    private int lineSum(TreeNode root, int[] maxSum) {
        
        if(root == null) return 0;
        int left = lineSum(root.left, maxSum);
        int right = lineSum(root.right, maxSum);
        
        int pathSum = root.val;         // pathsum of curr node = root + left + right
        if(left > 0) pathSum += left;   // We will l and r node only if they are +ve 
        if(right > 0) pathSum += right;

        maxSum[0] = Math.max(maxSum[0], pathSum);

        return root.val + Math.max(0, Math.max(left, right));   // if l or r is -ve then we will make it 0
    }
}