package removeduplicatesfromll;
/*
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveDuplicatesFromLL {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode node = head;
        ListNode prev = temp;
        while (node != null) {
            if (node.val == val) {
                prev.next = node.next;
            } else {
                prev = node;
            }
            node = node.next;
        }
        return temp.next;
    }
}
