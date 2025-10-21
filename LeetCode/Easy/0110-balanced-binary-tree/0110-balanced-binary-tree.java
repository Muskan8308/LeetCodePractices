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
   
    public boolean isBalanced(TreeNode root) {

        HashMap<TreeNode, Integer> dp = new HashMap<>();
        return balanced(root, dp);        
    }

    public boolean balanced(TreeNode root, HashMap<TreeNode, Integer> dp) {
        if(root == null) return true;

        int left = height(root.left, dp);
        int right = height(root.right, dp);

        int ans = Math.abs(left - right);
        if(ans > 1) return false;

        return balanced(root.left, dp) && balanced(root.right, dp);
    }

    public int height(TreeNode root, HashMap<TreeNode, Integer> dp) {
        
        if(root == null) return 0;
        if(dp.containsKey(root)) return dp.get(root);

        dp.put(root, 1 + Math.max(height(root.left, dp), height(root.right, dp)));
        return dp.get(root);
    }

}