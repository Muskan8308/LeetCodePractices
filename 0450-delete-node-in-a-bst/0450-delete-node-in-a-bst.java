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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp, key);
        return temp.left;
    }

    public void delete(TreeNode root, int key)
	{
		if(root == null) return;
		
		if(root.val > key)		// left
		{
			if(root.left == null) return;
			if(root.left.val == key) 
			{
				TreeNode l = root.left;
				if(l.left == null && l.right == null) root.left = null;   	// for 0 child
				else if(l.left == null || l.right == null)					// for 1 child
				{
					if(l.left != null) root.left = l.left;
					else root.left = l.right;
				}
                else                // for 2 childs
                {
                    TreeNode curr = l;
                    TreeNode pred = curr.left;
                    while(pred.right != null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
			}
			else delete(root.left, key);
		}
		
		if(root.val < key)		// right
		{
			if(root.right == null) return;
			if(root.right.val == key) 
			{
				TreeNode r = root.right;
				if(r.left == null && r.right == null) root.right = null;   	// for 0 child
				else if(r.left == null || r.right == null)					// for 1 child
				{
					if(r.left != null) root.right = r.left;
					else root.right = r.right;
				}
                else                // for 2 childs
                {
                    TreeNode curr = r;
                    TreeNode pred = curr.left;
                    while(pred.right != null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
			}
			else delete(root.right, key);
		}
	}

}