package medium.lists;

import common.helper_classes.ListNode;

public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode fast = res;
		ListNode slow = res;

		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return res.next;
	}

}
