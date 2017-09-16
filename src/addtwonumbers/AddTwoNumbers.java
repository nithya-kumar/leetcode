package addtwonumbers;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = addTwoNumbers(l1, l2);

	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode a1 = l1, a2 = l2, a3 = l3;
		int add = 0;
		while (a1 != null || a2 != null){
            if(a1 != null) {
                add += a1.val;
                a1 = a1.next;
            }
 
            if(a2 != null) {
                add += a2.val;
                a2 = a2.next;
            }
 
            a3.next = new ListNode(add%10);
            a3 = a3.next;
            add /= 10;
        }
		
		if(add == 1) 
            a3.next=new ListNode(1);
		
		return l3.next;
	}

}
