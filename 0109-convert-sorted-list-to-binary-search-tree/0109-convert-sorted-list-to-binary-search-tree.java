/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        ListNode temp = head;
        int n = 0;
        while(temp != null) 
        {
            n++;
            temp = temp.next;
        }

        int[] nums = new int[n];
        int idx = 0;
        temp = head;

        while(temp != null) 
        {
            nums[idx++] = temp.val;
            temp = temp.next;
        }
        
        return helper(nums, 0, n-1);
    }

    public TreeNode helper(int[] nums, int l, int h)
    {
        if(l > h) return null;

        int mid = l + (h-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, l, mid-1);
        root.right = helper(nums, mid+1, h);

        return root;
    }
}