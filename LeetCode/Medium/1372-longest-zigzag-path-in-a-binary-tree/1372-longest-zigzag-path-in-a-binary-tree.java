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
    public int longestZigZag(TreeNode root) {

        int[] maxlen = {0};
        zigZag(root, 0, 0, maxlen);         // 0 - left
        zigZag(root, 1, 0, maxlen);         // 1 - right

        return maxlen[0];
    }

    private void zigZag(TreeNode root, int dir, int currlen, int[] maxlen) {
        if(root == null) return;
        maxlen[0] = Math.max(maxlen[0], currlen);

        if(dir == 1)                               // parent's direction is right   
        {
            zigZag(root.left, 0, currlen + 1, maxlen);     // going on opposite dir of parents will increase currlen
            zigZag(root.right, 1, 1, maxlen);              // going on the same dir of parents will again start the currlen to 1
        }
        else                                       // parent's dir is left
        {
            zigZag(root.left, 0, 1, maxlen);
            zigZag(root.right, 1, currlen + 1, maxlen);
        }

    }
}