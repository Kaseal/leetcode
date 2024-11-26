package medium.linked_list;

import common.helper_classes.ListNode;

import java.util.Stack;

//2130. Maximum Twin Sum of a Linked List (Medium)
public class MaximumTwinSumOfALinkedList {

	public int pairSum(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		if (head.next.next == null) {
			return head.val + head.next.val;
		}

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Stack<ListNode> stack = new Stack<>();
		slow = slow.next;
		while (slow != null) {
			stack.push(slow);
			slow = slow.next;
		}

		int sum = Integer.MIN_VALUE;

		while (stack.size() > 0) {
			sum = Math.max(sum, head.val + stack.pop().val);
			head = head.next;
		}

		return sum;
	}

}
