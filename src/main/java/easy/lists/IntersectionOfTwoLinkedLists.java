package easy.lists;

import common.helper_classes.ListNode;

import java.util.HashSet;
import java.util.Set;

//160. Intersection of Two Linked Lists (Easy)
public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();

		ListNode ln1 = headA;
		ListNode ln2 = headB;

		while (ln1 != null) {
			if (!set.add(ln1)) {
				return ln1;
			}
			ln1 = ln1.next;
		}

		while (ln2 != null) {
			if (!set.add(ln2)) {
				return ln2;
			}
			ln2 = ln2.next;
		}

		return null;
	}

	/*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode ln1 = headA;
		ListNode ln2 = headB;

		while (ln1 != ln2) {
			if (ln1 == null) {
				ln1 = headB;
			} else {
				ln1 = ln1.next;
			}
			if (ln2 == null) {
				ln2 = headA;
			} else {
				ln2 = ln2.next;
			}

		}

		return ln1;
	}*/

}
