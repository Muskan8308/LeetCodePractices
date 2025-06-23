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
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null) return 0;
        int cnt = noOfPaths(root, (long)(targetSum));
        cnt += (pathSum(root.left, targetSum) + pathSum(root.right, targetSum));
        return cnt;
    }

    public int noOfPaths(TreeNode root, long targetSum) {
        
        if(root == null) return 0;
        int cnt = 0;
        if((long)root.val == targetSum) cnt++;
        return cnt + noOfPaths(root.left, targetSum - (long)root.val) + noOfPaths(root.right, targetSum - (long)root.val);
    }
}