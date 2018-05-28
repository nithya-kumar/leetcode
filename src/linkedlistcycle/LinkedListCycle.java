package linkedlistcycle;
/*
 * https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
