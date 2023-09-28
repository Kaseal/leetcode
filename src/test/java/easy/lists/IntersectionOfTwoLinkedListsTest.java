package easy.lists;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoLinkedListsTest {

	private final IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

	@Test
	void test1() {
		ListNode listA = new ListNode(4);
		ListNode listA1 = new ListNode(1);
		listA.next = listA1;

		ListNode intersectedNode = new ListNode(8);
		listA1.next = intersectedNode;

		intersectedNode.next = new ListNode(4, new ListNode(5));

		ListNode listB = new ListNode(5,
				new ListNode(6,
						new ListNode(1, intersectedNode)));

		Assertions.assertEquals(intersectedNode, intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
	}

	@Test
	void test2() {
		ListNode listA = new ListNode(1);
		ListNode listA1 = new ListNode(9);
		listA.next = listA1;
		ListNode listA2 = new ListNode(1);
		listA1.next = listA2;

		ListNode intersectedNode = new ListNode(2);
		listA2.next = intersectedNode;

		intersectedNode.next = new ListNode(4);

		ListNode listB = new ListNode(3, intersectedNode);

		Assertions.assertEquals(intersectedNode, intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
	}

	@Test
	void test3() {
		ListNode listA = new ListNode(2,
				new ListNode(6,
						new ListNode(4)));

		ListNode listB = new ListNode(1,
				new ListNode(5));

		Assertions.assertNull(intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
	}
}