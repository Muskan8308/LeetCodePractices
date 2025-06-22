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

    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root == null) return new ArrayList<>();
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, targetSum, paths, list);
        return paths;
    }

    public void helper(TreeNode root, int targetSum, List<List<Integer>> paths, List<Integer> list)
    {
        if(root == null) return;
        if(root.left == null && root.right == null)
        {
            list.add(root.val);
            if(root.val == targetSum)
            {
                List<Integer> a = new ArrayList<>();
                for(int i = 0; i < list.size(); i++)
                {
                    a.add(list.get(i));
                }
                paths.add(a);
            }
            list.remove(list.size() - 1);
            return;
        }

        list.add(root.val);
        helper(root.left, targetSum - root.val, paths, list);
        helper(root.right, targetSum - root.val, paths, list);
        list.remove(list.size() - 1);
    }
}