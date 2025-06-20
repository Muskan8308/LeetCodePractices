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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root, ans, new StringBuilder(""));
        return ans;
    }

    private void paths(TreeNode root, List<String> ans, StringBuilder s)
    {
        if(root == null) return;
        int len = s.length();
        if(root.left == null  && root.right == null)    // leaf node 
        {
            s.append(root.val);
            ans.add(s.toString());
            return;
        }
        s.append(root.val).append("->");
        paths(root.left, ans, new StringBuilder(s));
        paths(root.right, ans, new StringBuilder(s));
        s.setLength(len);                               // set to original length
    }
}