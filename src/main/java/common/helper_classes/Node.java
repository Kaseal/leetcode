package common.helper_classes;

public class Node {

	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int val) {
		this.val = val;
	}

	public Node(int val, Node left, Node right, Node next) {
		this.val = val;
		this.left = left;
		this.right = right;
		this.next = next;
	}

	public static boolean compareNodes(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}

		if ((node1 != null && node2 != null && node1.val == node2.val) &&
				(node1.next == null && node2.next == null ||
						node1.next != null && node2.next != null && node1.next.val == node2.next.val)) {
			return compareNodes(node1.left, node2.left) && compareNodes(node1.right, node2.right);
		}

		return false;
	}

}
