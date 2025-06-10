/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p == root || q == root) return root;
        if(p == q) return p;
        boolean leftP = contains(root.left, p);
        boolean rightQ = contains(root.right, q);
        if((leftP && rightQ) || (!leftP && !rightQ)) return root;       // basically, both p and q are in subtrees therefore LCA will be the root
        if(leftP && !rightQ) return lowestCommonAncestor(root.left, p, q);      // if q is not in right subtree then definitely it will be in left subtree
        if(!leftP && rightQ) return lowestCommonAncestor(root.right, p, q);     // if p is not in left subtree then definitely it will be in right subtree
        return root;
    }

    private boolean contains(TreeNode root, TreeNode node)
    {
        if(root == null) return false;
        if(node == root) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
}