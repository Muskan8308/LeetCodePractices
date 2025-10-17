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
    public int diameterOfBinaryTree(TreeNode root) {
        
        Map<TreeNode, Integer> map = new HashMap<>();
        return diameter(root, map);
    }

    private int diameter(TreeNode root, Map<TreeNode, Integer> map) {
        if(root == null) return 0;

        int dia = levels(root.left, map) + levels(root.right, map);
        int left = diameter(root.left, map);
        int right = diameter(root.right, map);

        return Math.max(dia, Math.max(left, right));
    }

    private int levels(TreeNode root, Map<TreeNode, Integer> map)
    {
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int left = levels(root.left, map);
        int right = levels(root.right, map);
        map.put(root, 1 + Math.max(left, right));
        return map.get(root);

    }
}