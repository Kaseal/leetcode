package medium.lists;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

	private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

	@Test
	void test1() {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode expectedList = new ListNode(7, new ListNode(0, new ListNode(8)));

		Assertions.assertTrue(ListNode.compareListNodes(expectedList, addTwoNumbers.addTwoNumbers(l1, l2)));
	}

	@Test
	void test2() {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode expectedList = new ListNode(0);

		Assertions.assertTrue(ListNode.compareListNodes(expectedList, addTwoNumbers.addTwoNumbers(l1, l2)));
	}

	@Test
	void test3() {
		ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		ListNode expectedList = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
				new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

		Assertions.assertTrue(ListNode.compareListNodes(expectedList, addTwoNumbers.addTwoNumbers(l1, l2)));
	}

}