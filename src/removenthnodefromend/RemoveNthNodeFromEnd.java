package removenthnodefromend;
/*
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class RemoveNthNodeFromEnd {
	if (head == null)
        return null;
    ListNode temp = new ListNode(1);
    temp.next = head;
    ListNode p1 = temp;
    ListNode p2 = temp;
    int count = 0;
    while (p1 != null && count <= n) {
        count ++;
        p1 = p1.next;
    }
    while (p1 != null) {
        p1 = p1.next;
        p2 = p2.next;
    }
    p2.next = p2.next.next;
    return temp.next;
}
}
