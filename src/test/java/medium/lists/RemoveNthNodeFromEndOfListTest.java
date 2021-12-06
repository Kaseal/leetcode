package medium.lists;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {

	private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

	@Test
	void test1() {
		ListNode listNode = new ListNode(1, new ListNode(2,
				new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode expectedListNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));

		Assertions.assertTrue(ListNode.compareListNodes(expectedListNode,
				removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 2)));
	}

	@Test
	void test2() {
		ListNode listNode = new ListNode(1);

		Assertions.assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
	}

	@Test
	void test3() {
		ListNode listNode = new ListNode(1, new ListNode(2));
		ListNode expectedListNode = new ListNode(1);

		Assertions.assertTrue(ListNode.compareListNodes(expectedListNode,
				removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1)));
	}

	@Test
	void test4() {
		ListNode listNode = new ListNode(1, new ListNode(2));
		ListNode expectedListNode = new ListNode(2);

		Assertions.assertTrue(ListNode.compareListNodes(expectedListNode,
				removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 2)));
	}

}