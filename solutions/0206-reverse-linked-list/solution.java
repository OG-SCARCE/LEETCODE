/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next; // To temporarily store the next node
        
        // Iterate through the entire list 🔄
        while (curr != null) {
            next = curr.next;  // 1. Save the rest of the list
            curr.next = prev;  // 2. Reverse the current node's pointer
            prev = curr;       // 3. Move prev one step forward
            curr = next;       // 4. Move curr one step forward
        }
        
        // prev will be standing at the new head of the reversed list 🏁
        return prev;
    }
}
