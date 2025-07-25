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
    // printing from left to right
    public void printLR(TreeNode root, int n, List<Integer> arr)
    {
        if(root == null) return;
        if(n == 1)
        {
            arr.add(root.val);
            return;
        }
        printLR(root.left, n-1, arr);
        printLR(root.right, n-1, arr);
    }

    // finding the height 
    public int height(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))	return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = height(root) + 1;
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        for(int i = 1; i <= level; i++)
        {
            List<Integer> arr = new ArrayList<>();
            printLR(root, i, arr);  
            ans.add(arr);
        }
        return ans;
    }
}