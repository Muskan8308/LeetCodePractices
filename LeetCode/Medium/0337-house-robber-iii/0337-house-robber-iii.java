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
    public int rob(TreeNode root) {
        Map<TreeNode, Integer> dp = new HashMap<>();

        return robber(root, dp);
    }

    private int robber(TreeNode root, Map<TreeNode, Integer> dp) {
        
        if(root == null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int money = 0;

        if(root.left != null)
        money += robber(root.left.left, dp) + robber(root.left.right, dp);
        
        if(root.right != null)
        money += robber(root.right.left, dp) + robber(root.right.right, dp);

        money = Math.max(money + root.val, robber(root.left, dp) + robber(root.right, dp));
        dp.put(root, money);
        
        return money;
    }
}