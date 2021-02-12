package easy.lists;

import easy.helper_classes.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

	RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

	@Test
	public void test112() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2)));
		ListNode resultListNode = new ListNode(1, new ListNode(2));

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test11233() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		ListNode resultListNode = new ListNode(1, new ListNode(2, new ListNode(3)));

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test111() {
		ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(1)));
		ListNode resultListNode = new ListNode(1);

		ListNode resultOfMethodListNode = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void testEmptyList() {
		Assert.assertNull(removeDuplicatesFromSortedList.deleteDuplicates(null));
	}

}