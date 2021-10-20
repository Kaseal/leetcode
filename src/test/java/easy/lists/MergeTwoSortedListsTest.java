package easy.lists;

import common.helper_classes.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

	private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

	@Test
	public void test1() {
		ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode resultListNode = new ListNode(1, new ListNode(1,
				new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

		ListNode resultOfMethodListNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test2() {
		ListNode listNode1 = null;
		ListNode listNode2 = new ListNode(0);
		ListNode resultListNode = new ListNode(0);

		ListNode resultOfMethodListNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

	@Test
	public void test3() {
		ListNode resultOfMethodListNode = mergeTwoSortedLists.mergeTwoLists(null, null);

		Assert.assertNull(resultOfMethodListNode);
	}

	@Test
	public void test4() {
		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(1);
		ListNode resultListNode = new ListNode(1, new ListNode(2));

		ListNode resultOfMethodListNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);

		Assert.assertTrue(ListNode.compareListNodes(resultListNode, resultOfMethodListNode));
	}

}