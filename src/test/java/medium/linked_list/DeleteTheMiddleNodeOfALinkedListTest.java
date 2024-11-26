package medium.linked_list;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeleteTheMiddleNodeOfALinkedListTest {

	private final DeleteTheMiddleNodeOfALinkedList instance = new DeleteTheMiddleNodeOfALinkedList();

	@Test
	void test1() {
		ListNode input = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7,
				new ListNode(1, new ListNode(2, new ListNode(6, null)))))));

		ListNode expected = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(1,
				new ListNode(2, new ListNode(6, null))))));

		Assertions.assertTrue(ListNode.compareListNodes(expected, instance.deleteMiddle(input)));
	}

	@Test
	void test2() {
		ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));

		ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, null)));

		Assertions.assertTrue(ListNode.compareListNodes(expected, instance.deleteMiddle(input)));
	}

	@Test
	void test3() {
		ListNode input = new ListNode(2, new ListNode(1, null));

		ListNode expected = new ListNode(2, null);

		Assertions.assertTrue(ListNode.compareListNodes(expected, instance.deleteMiddle(input)));
	}

	@Test
	void test4() {
		ListNode input = new ListNode(1, null);

		Assertions.assertNull(instance.deleteMiddle(input));
	}

	@Test
	void test5() {
		ListNode input = new ListNode(3, new ListNode(1, new ListNode(2, null)));

		ListNode expected = new ListNode(3, new ListNode(2, null));

		Assertions.assertTrue(ListNode.compareListNodes(expected, instance.deleteMiddle(input)));
	}

}