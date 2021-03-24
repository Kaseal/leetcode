package easy.lists;

import easy.helper_classes.ListNode;

//206. Reverse Linked List (Easy)
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode buf = head;
		ListNode res = null;
		while (buf != null) {
			if (res == null) {
				res = new ListNode(buf.val);
			} else {
				ListNode buf2 = res;
				res = new ListNode(buf.val);
				res.next = buf2;
			}
			buf = buf.next;
		}

		return res;
	}

}
