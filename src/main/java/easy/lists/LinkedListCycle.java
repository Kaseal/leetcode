package easy.lists;

import common.helper_classes.ListNode;

//141. Linked List Cycle (Easy)
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		if (head.next == null) {
			return false;
		}

		if (head.next.next == head) {
			return true;
		}

		ListNode node = head;
		while (node != null) {
			if (node.next == node) {
				return true;
			}

			ListNode buf = node;
			node = node.next;
			buf.next = buf;
		}

		return false;
	}

}
