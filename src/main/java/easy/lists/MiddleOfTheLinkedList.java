package easy.lists;

import common.helper_classes.ListNode;

//876. Middle of the Linked List (Easy)
public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return head;
		}
		int count = 1;
		ListNode cursor = head;
		while (cursor.next != null) {
			count++;
			cursor = cursor.next;
		}

		if (count == 1) {
			return head;
		}

		int i = 0;
		cursor = head;
		while (i++ != count / 2) {
			cursor = cursor.next;
		}

		return cursor;
	}

	public ListNode _middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
