package reversenodesinkgroups;

public class ReverseNodesInKGroups {
	public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode curr = head, prev = null, next = null;
    	int count = 0;
    	while (count < k && curr != null) {
        	curr = curr.next;
        	count ++;
    	}
    	if (count == k)
    	{
        	curr = head;
        	count = 0;
        	while (curr != null && count < k) {
            	count ++;
            	next = curr.next;
            	curr.next = prev;
            	prev = curr;
            	curr = next;
        	}
        	if (curr != null)
        	head.next = reverseKGroup (curr, k);
        	return prev;
    	}
    	return head;
	}
}
