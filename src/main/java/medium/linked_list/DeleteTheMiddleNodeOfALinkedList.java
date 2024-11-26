package medium.linked_list;

import common.helper_classes.ListNode;

//2095. Delete the Middle Node of a Linked List (Medium)
public class DeleteTheMiddleNodeOfALinkedList {

	//fast/slow pointer approach preferable
	public ListNode deleteMiddle(ListNode head) {
		if (head != null && head.next == null) {
			return null;
		}

		int count = 1;

		ListNode pointer = head;

		while (pointer.next != null) {
			pointer = pointer.next;
			count++;
		}

		if (count == 3) {
			head.next = head.next.next;
			return head;
		}

		ListNode last = pointer;

		int middle = (int) Math.ceil((double) count / 2) + (count % 2 == 0 ? 1 : 0);

		int k = 1;
		pointer = head;
		ListNode prev = head;
		while (k++ < middle && pointer != null) {
			prev = pointer;
			pointer = pointer.next;
			if (pointer == last) {
				prev.next = null;
				return head;
			}
		}

		if (prev == head) {
			return head.next;
		}

		prev.next = prev.next.next;

		return head;
	}

}
