package easy.lists;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {

	private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

	@Test
	void test1() {
		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,
				new ListNode(4, new ListNode(5)))));

		ListNode expectedList = new ListNode(3, new ListNode(4, new ListNode(5)));

		Assertions.assertTrue(ListNode.compareListNodes(expectedList, middleOfTheLinkedList.middleNode(listNode)));
	}

	@Test
	void test2() {
		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,
				new ListNode(4, new ListNode(5, new ListNode(6))))));

		ListNode expectedList = new ListNode(4, new ListNode(5, new ListNode(6)));

		Assertions.assertTrue(ListNode.compareListNodes(expectedList, middleOfTheLinkedList.middleNode(listNode)));
	}

}