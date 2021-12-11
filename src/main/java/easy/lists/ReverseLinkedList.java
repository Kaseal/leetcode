package easy.lists;

import common.helper_classes.ListNode;

import java.util.Stack;

//206. Reverse Linked List (Easy)
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode listNode = reverseList(head.next);

		head.next.next = head;
		head.next = null;

		return listNode;
	}

	public ListNode __reverseList(ListNode head) {
		ListNode res;

		if (head == null) {
			return null;
		}

		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}

		res = stack.pop();
		ListNode buf = res;
		while (!stack.isEmpty()) {
			buf.next = stack.pop();
			buf = buf.next;
		}
		buf.next = null;

		return res;
	}

	public ListNode _reverseList(ListNode head) {
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
