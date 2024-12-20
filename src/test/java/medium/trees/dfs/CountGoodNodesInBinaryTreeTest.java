package medium.trees.dfs;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountGoodNodesInBinaryTreeTest {

	private final CountGoodNodesInBinaryTree instance = new CountGoodNodesInBinaryTree();

	@Test
	void test1() {
		TreeNode input = new TreeNode(3,
				new TreeNode(1,
						new TreeNode(3), null),
				new TreeNode(4,
						new TreeNode(1), new TreeNode(5)));

		Assertions.assertEquals(4, instance.goodNodes(input));
	}

	@Test
	void test2() {
		TreeNode input = new TreeNode(3,
				new TreeNode(3,
						new TreeNode(4), new TreeNode(2)),
				null);

		Assertions.assertEquals(3, instance.goodNodes(input));
	}

	@Test
	void test3() {
		Assertions.assertEquals(1, instance.goodNodes(new TreeNode(1)));
	}

}