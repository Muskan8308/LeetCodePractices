class Solution {

    // It includes the logic of SAME TREE + INVERT TREE = SYMMETRIC TREE 
    public boolean isSame(TreeNode p, TreeNode q)
    {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root)
    {
        if(root == null) return root;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);

        return root;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        root.left = invertTree(root.left);
        return isSame(root.left, root.right);
    }
}