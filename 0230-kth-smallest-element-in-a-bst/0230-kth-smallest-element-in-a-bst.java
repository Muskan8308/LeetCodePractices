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

    private void kthEle(TreeNode root, int k, int[] cnt)
    {
        if(root == null) return;

        kthEle(root.left, k, cnt);
        cnt[0]++;
        if(cnt[0] == k) 
        {
            cnt[0] = root.val;
            return;
        }
        kthEle(root.right, k, cnt);
  
    } 

    public int kthSmallest(TreeNode root, int k) {

        int[] cnt = {0};
        kthEle(root, k, cnt);
        return cnt[0];

       /* 
        int kthValue = 0;
        TreeNode curr = root;

        // Morris traversal
        while(curr != null)
        {
            if(curr.left != null)
            {
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr)
                pred = pred.right;

                if(pred.right == null)
                {
                    pred.right = curr;
                    curr = curr.left;
                }
                else if(pred.right == curr)
                {
                    pred.right = null;
                    kthValue++;
                    if(kthValue == k) return curr.val;
                    curr = curr.right;
                }
            }
            else
            {
                kthValue++;
                if(kthValue == k) return curr.val;
                curr = curr.right;
            }
        }
        return kthValue;
        */
    }
}