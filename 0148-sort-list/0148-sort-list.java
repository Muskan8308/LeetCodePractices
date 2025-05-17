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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        return head;

        // Step1. Divide the list into two halves
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // Step2. Sort each half
        ListNode l1 = sortList(head), l2 = sortList(slow);

        // Step3. Merge l1 and l2
        return merge(l1, l2);
    }

    ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode l = new ListNode(0), p = l;

        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                p.next = l1;
                l1 = l1.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        // remaining nodes of l1
        if(l1 != null)
        p.next = l1;

        // remaining nodes of l2
        if(l2 != null)
        p.next = l2;

        return l.next;
    }
}