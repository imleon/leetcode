/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = head.next.next;
        while(true) {
            if (p == q) {
                return true;
            }
            if (q.next == null || q.next.next == null)  {
                return false;
            }
            q = q.next.next;
            p = p.next;
        }
    }
}

