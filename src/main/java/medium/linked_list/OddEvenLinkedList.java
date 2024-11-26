package medium.linked_list;

import common.helper_classes.ListNode;

//328. Odd Even Linked List (Medium)
public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode oddPointer = head;
		ListNode evenPointer = head.next;
		ListNode even = head.next;

		while (oddPointer != null && oddPointer.next != null) {
			oddPointer.next = oddPointer.next.next;
			if (oddPointer.next != null) {
				oddPointer = oddPointer.next;
			}
			if (evenPointer.next != null) {
				evenPointer.next = oddPointer.next;
				evenPointer = evenPointer.next;
			}
		}

		oddPointer.next = even;

		return head;
	}

}
