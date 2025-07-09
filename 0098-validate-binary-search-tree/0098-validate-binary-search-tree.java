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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        
        inOrder(root, ans);
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
        {
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] != ans.get(i) || ans.get(i) == ans.get(i+1))
            return false;
        }
        return arr[arr.length-1] == ans.get(ans.size()-1) ? true : false;
    }

    public void inOrder(TreeNode root, List<Integer> ans)
    {
        if(root == null) return;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}