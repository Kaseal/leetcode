package medium.linked_list;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumTwinSumOfALinkedListTest {

	private MaximumTwinSumOfALinkedList instance = new MaximumTwinSumOfALinkedList();

	@Test
	void test1() {
		ListNode input = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));

		Assertions.assertEquals(6, instance.pairSum(input));
	}

	@Test
	void test2() {
		ListNode input = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));

		Assertions.assertEquals(7, instance.pairSum(input));
	}

	@Test
	void test3() {
		ListNode input = new ListNode(1, new ListNode(100000));

		Assertions.assertEquals(100001, instance.pairSum(input));
	}

}