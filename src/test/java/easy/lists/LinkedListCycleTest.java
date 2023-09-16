package easy.lists;


import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

	private final LinkedListCycle linkedListCycle = new LinkedListCycle();

	@Test
	void test1() {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(-4);

		ListNode head = new ListNode(3);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node1;

		Assertions.assertTrue(linkedListCycle.hasCycle(head));
	}

	@Test
	void test2() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		head.next = node1;
		node1.next = head;

		Assertions.assertTrue(linkedListCycle.hasCycle(head));
	}

	@Test
	void test3() {
		ListNode head = new ListNode(1);

		Assertions.assertFalse(linkedListCycle.hasCycle(head));
	}

}