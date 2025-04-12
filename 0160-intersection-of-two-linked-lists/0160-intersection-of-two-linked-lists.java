/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int m = size(temp1);    // 1st list
        int n = size(temp2);    // 2nd list

        if(m > n)
        {
            for(int i = 0; i < m-n; i++)
            temp1 = temp1.next;
        }
        else
        {
            for(int i = 0; i < n-m; i++)
            temp2 = temp2.next;
        }
        while(temp1 != temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public int size(ListNode head)
    {
        int cnt = 0;
        while(head != null)
        {
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}