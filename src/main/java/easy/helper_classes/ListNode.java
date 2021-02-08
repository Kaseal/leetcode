package easy.helper_classes;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static boolean compareListNodes(ListNode listNode1, ListNode listNode2) {
		if (listNode1 == null || listNode2 == null) {
			return false;
		}
		while (listNode1 != null && listNode2 != null) {
			if (listNode1.val == listNode2.val) {
				listNode1 = listNode1.next;
				listNode2 = listNode2.next;
			} else {
				return false;
			}
		}
		return true;
	}

}