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
    public void recoverTree(TreeNode root) {
        
        TreeNode prevprev = null, prev = null, curr = root;
        List<TreeNode> list = new ArrayList<>();

        while(curr != null)
        {
            if(curr.left != null) 
            {
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;

                if(pred.right == null)
                {
                    pred.right = curr;
                    curr = curr.left;
                }
                else
                {
                    pred.right = null;
                    if(prev != null && prevprev != null)
                    {
                        if(prev.val > curr.val && prev.val > prevprev.val) list.add(prev);
                        if(prev.val < curr.val && prev.val < prevprev.val) list.add(prev);
                    }
                    else
                        if(prev != null && prev.val > curr.val) list.add(prev); // for 1st element 

                    prevprev = prev;
                    prev = curr;
                    curr = curr.right;
                }
            }
            else
            {
                if(prev != null && prevprev != null)
                {
                    if(prev.val > curr.val && prev.val > prevprev.val) list.add(prev);
                    if(prev.val < curr.val && prev.val < prevprev.val) list.add(prev);
                }
                else
                    if(prev != null && prev.val > curr.val) list.add(prev); // for 1st element 

                prevprev = prev;
                prev = curr;
                curr = curr.right;
            }
        }

        if(prev.val < prevprev.val) list.add(prev);
        TreeNode node1 = list.get(0);
        TreeNode node2 = list.get(list.size() - 1);
        
        // swapping the wrong node's values
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}