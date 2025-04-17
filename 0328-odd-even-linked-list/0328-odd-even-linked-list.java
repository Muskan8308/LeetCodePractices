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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempO = odd, tempE = even, temp = head;

        while(temp != null)
        {
            tempO.next = temp;
            temp = temp.next;
            tempO = tempO.next;

            tempE.next = temp;
            if(temp == null) break;
            temp = temp.next;
            tempE = tempE.next;
        }
        odd = odd.next;
        even = even.next;
        tempO.next = even;
        return odd;
    }
}