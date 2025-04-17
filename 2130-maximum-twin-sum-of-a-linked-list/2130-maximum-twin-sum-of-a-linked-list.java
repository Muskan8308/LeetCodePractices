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
class Solution {
    public int pairSum(ListNode head) {
        
        // Step1. Find the left mid

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is the left mid
        // Step2. Reverse the left part of mid

        ListNode temp = reverse(slow.next);
        slow.next = temp;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        ListNode p1 = head, p2 = slow.next;

        // find the max twin sum
        while(p2 != null)
        {
            sum = p1.val + p2.val;
            maxSum = Math.max(maxSum, sum);
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }

    private static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null, after = null;

        while(curr != null)
        {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}