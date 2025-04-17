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

    private ListNode reverse(ListNode head)
    {
        ListNode curr = head, prev = null, after = null;

        while(curr != null)
        {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        
        // Step 1. Find the left middle
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        } 

        // here, slow is the left midddle

        // Step 2. Reverse the right part of the middle
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 = head, p2 = slow.next;

        // Step 3. check the values are equal or not
        while(p2 != null)
        {
            if(p1.val != p2.val)  return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}