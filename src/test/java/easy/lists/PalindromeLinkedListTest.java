package easy.lists;

import easy.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

	private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

	@Test
	void test1221() {
		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

		Assertions.assertTrue(palindromeLinkedList.isPalindrome(listNode));
	}

	@Test
	void test12() {
		ListNode listNode = new ListNode(1, new ListNode(2));

		Assertions.assertFalse(palindromeLinkedList.isPalindrome(listNode));
	}

}