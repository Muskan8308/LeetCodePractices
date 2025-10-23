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
    static int maxlen;
    public int longestZigZag(TreeNode root) {

        maxlen = 0;
        zigZag(root, 0, 0);         // 0 - left
        zigZag(root, 1, 0);         // 1 - right

        return maxlen;
    }

    private void zigZag(TreeNode root, int dir, int currlen) {
        if(root == null) return;
        maxlen = Math.max(maxlen, currlen);

        if(dir == 1)                               // parent's direction is right   
        {
            zigZag(root.left, 0, currlen + 1);     // going on opposite dir of parents will increase currlen
            zigZag(root.right, 1, 1);              // going on the same dir of parents will again start the currlen to 1
        }
        else                                       // parent's dir is left
        {
            zigZag(root.left, 0, 1);
            zigZag(root.right, 1, currlen + 1);
        }

    }
}