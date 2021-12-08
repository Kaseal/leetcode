package medium.trees;

import common.helper_classes.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulatingNextRightPointersInEachNodeTest {

	private final PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode =
			new PopulatingNextRightPointersInEachNode();

	@Test
	public void test1() {
		Node node = new Node(1,
				new Node(2,
						new Node(4),
						new Node(5),
						null),
				new Node(3,
						new Node(6),
						new Node(7),
						null),
				null);

		Node expectedNode = new Node(1,
				new Node(2,
						new Node(4),
						new Node(5),
						null),
				new Node(3,
						new Node(6),
						new Node(7),
						null),
				null);

		expectedNode.left.next = expectedNode.right;
		expectedNode.left.left.next = expectedNode.left.right;
		expectedNode.left.right.next = expectedNode.right.left;
		expectedNode.right.left.next = expectedNode.right.right;

		Assertions.assertTrue(Node.compareNodes(expectedNode, populatingNextRightPointersInEachNode.connect(node)));
	}

	@Test
	public void test2() {
		Assertions.assertNull(populatingNextRightPointersInEachNode.connect(null));
	}

}