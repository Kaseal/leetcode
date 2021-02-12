package easy.lists;

import easy.helper_classes.ListNode;

//21. Merge Two Sorted Lists (Easy)
public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode bufNode = null;
		ListNode resultNode = null;

		if (l1 != null && l2 == null) {
			return l1;
		} else if (l2 != null && l1 == null) {
			return l2;
		}

		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					if (resultNode == null) {
						resultNode = new ListNode(l1.val);
						bufNode = resultNode;
					} else {
						bufNode.next = new ListNode(l1.val);
						bufNode = bufNode.next;
					}
					l1 = l1.next;
				} else if (l2.val < l1.val) {
					if (resultNode == null) {
						resultNode = new ListNode(l2.val);
						bufNode = resultNode;
					} else {
						bufNode.next = new ListNode(l2.val);
						bufNode = bufNode.next;
					}
					l2 = l2.next;
				} else {
					if (resultNode == null) {
						resultNode = new ListNode(l1.val);
						bufNode = resultNode;
						bufNode.next = new ListNode(l2.val);
						bufNode = bufNode.next;
					} else {
						bufNode.next = new ListNode(l1.val);
						bufNode = bufNode.next;
						bufNode.next = new ListNode(l2.val);
						bufNode = bufNode.next;
					}
					l1 = l1.next;
					l2 = l2.next;
				}
			} else if (l2 == null) {
				bufNode.next = new ListNode(l1.val);
				bufNode = bufNode.next;
				l1 = l1.next;
			} else {
				bufNode.next = new ListNode(l2.val);
				bufNode = bufNode.next;
				l2 = l2.next;
			}
		}

		return resultNode;
	}

}
