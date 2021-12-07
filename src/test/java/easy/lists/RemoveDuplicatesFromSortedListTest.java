package easy.lists;

import common.helper_classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {

	RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

	@Test
	public void test112() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2)));
		ListNode resultListNode = new ListNode(1, new ListNode(2));

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assertions.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test11233() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		ListNode resultListNode = new ListNode(1, new ListNode(2, new ListNode(3)));

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assertions.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test111() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(1)));
		ListNode resultListNode = new ListNode(1);

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assertions.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void testEmptyList() {
		Assertions.assertNull(removeDuplicatesFromSortedList.deleteDuplicates(null));
	}

}