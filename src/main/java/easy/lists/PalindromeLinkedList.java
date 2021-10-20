package easy.lists;

import common.helper_classes.ListNode;

//234. Palindrome Linked List (Easy)
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.val);
			head = head.next;
		}

		return sb.toString().equals(sb.reverse().toString());
	}

}
