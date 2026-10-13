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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode leftNode = head;
        ListNode rightNode = head;

        for (int i = 1; i < left; i++) {
            leftNode = leftNode.next;
        }

        for (int i = 1; i < right; i++) {
            rightNode = rightNode.next;
        }

        ListNode beforeLeft = null;
        ListNode temp = head;

        for (int i = 1; i < left; i++) {
            beforeLeft = temp;
            temp = temp.next;
        }

        ListNode rightNext = rightNode.next;

        ListNode curr = leftNode;
        ListNode prev = rightNext;

        while (curr != rightNext) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        if (beforeLeft != null) {
            beforeLeft.next = rightNode;
        } else {
            head = rightNode;
        }

        return head;
    }
}
