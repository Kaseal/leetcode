package medium.linked_list;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

	private OddEvenLinkedList instance = new OddEvenLinkedList();

	@Test
	void test1() {
		ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))));

		Assertions.assertTrue(ListNode.compareListNodes(instance.oddEvenList(input), expected));
	}

	@Test
	void test2() {
		ListNode input = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5,
				new ListNode(6, new ListNode(4, new ListNode(7)))))));

		ListNode expected = new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7,
				new ListNode(1, new ListNode(5, new ListNode(4)))))));

		Assertions.assertTrue(ListNode.compareListNodes(instance.oddEvenList(input), expected));
	}

}