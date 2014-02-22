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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        while(head.next != null) {
            if (head.val == head.next.val) {
                head = head.next;
            } else {
                break;
            }
        }
        ListNode p = head;
        while(p.next != null) {
            ListNode n = p.next;
            while(n.next != null) {
                if (n.val == n.next.val) {
                    n = n.next;
                } else {
                    break;
                }
            }
            p.next = n;
            p = n;
        }
        return head;
    }
}

