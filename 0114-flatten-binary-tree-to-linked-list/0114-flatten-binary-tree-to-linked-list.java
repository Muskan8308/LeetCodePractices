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
    public void flatten(TreeNode root) {
        
        // Approach 2 - Pure recursion without extra space

        if(root == null) return;
        TreeNode LST = root.left;
        TreeNode RST = root.right;
        flatten(root.left);
        flatten(root.right);

        root.left = null;
        root.right = LST;

        TreeNode temp = root;     
        while(temp.right != null)
        temp = temp.right;
        
        temp.right = RST;
        

        /*
        // Approach 1
        List<TreeNode> pre = new ArrayList<>();
        preorder(root, pre);
        for(int i = 0; i < pre.size(); i++)
        {
            if(i != pre.size()-1) pre.get(i).right = pre.get(i+1);
            pre.get(i).left = null; 
        }
        */

     /*    
        // Using Morris Traversal technique
        // T.C -> O(N) & S.C -> O(1)
        TreeNode curr = root;
        while(curr != null)
        {
            if(curr.left != null) 
            {
                TreeNode pred = curr.left;
                while(pred.right != null)
                pred = pred.right;

                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        } 
     */
    }

    public void preorder(TreeNode root, List<TreeNode> pre)
    {
        if(root == null) return;

        pre.add(root);
        preorder(root.left, pre);
        preorder(root.right, pre);
    
    }
}