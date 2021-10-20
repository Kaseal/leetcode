package easy.lists;

import common.helper_classes.ListNode;

//83. Remove Duplicates from Sorted List (Easy)
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode prev = head;
		ListNode next = prev.next;

		while (next != null) {
			if (next.val == prev.val) {
				prev.next = next.next;
			} else {
				prev = next;
			}
			next = next.next;
		}

		return head;
	}

}
