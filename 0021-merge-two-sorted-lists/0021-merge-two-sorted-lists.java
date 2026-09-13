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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while( ptr1 != null && ptr2 != null){
            if( ptr1.val <= ptr2.val){
                tail.next = ptr1;
                ptr1 = ptr1.next;
            }else{
                tail.next = ptr2;
                ptr2 = ptr2.next;
            }
            tail = tail.next;
        }
        while( ptr1 != null){
            tail.next = ptr1;
            ptr1 = ptr1.next;
            tail = tail.next;
        }
        while( ptr2 != null){
            tail.next = ptr2;
            ptr2 = ptr2.next;
            tail = tail.next;
        }

        return dummy.next;
    }
}