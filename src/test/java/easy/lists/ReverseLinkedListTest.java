package easy.lists;

import easy.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

	private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

	@Test
	void test12345() {
		ListNode listNode = new ListNode(1,
				new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode resultedListNode = new ListNode(5,
				new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

		Assertions.assertTrue(ListNode.compareListNodes(resultedListNode, reverseLinkedList.reverseList(listNode)));
	}

	@Test
	void test12() {
		ListNode listNode = new ListNode(1, new ListNode(2));
		ListNode resultedListNode = new ListNode(2, new ListNode(1));

		Assertions.assertTrue(ListNode.compareListNodes(resultedListNode, reverseLinkedList.reverseList(listNode)));
	}

	@Test
	void test_empty() {
		Assertions.assertNull(reverseLinkedList.reverseList(null));
	}

}