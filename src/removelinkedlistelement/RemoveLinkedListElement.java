package removelinkedlistelement;

public class RemoveLinkedListElement {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode node = head;
        while (node != null && node.val == val) {
            head = node.next;
            node = node.next;
        }
        node = head;
        ListNode prev = null;
        while (node != null) {
            if (node.val == val) {
                prev.next = node.next;
            } else {
                prev = node;
            }
            node = node.next;
        }
        return head;
    }
}
