package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

	private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

	@Test
	public void test3_9_20_null_null_15_7() {
		TreeNode treeNode = new TreeNode(3,
				new TreeNode(9),
				new TreeNode(20,
						new TreeNode(15),
						new TreeNode(7)));

		Assertions.assertTrue(balancedBinaryTree.isBalanced(treeNode));
	}

	@Test
	public void test1_2_2_3_3_null_null_4_4() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(3,
								new TreeNode(4),
								new TreeNode(4)),
						new TreeNode(3)),
				new TreeNode(2));

		Assertions.assertFalse(balancedBinaryTree.isBalanced(treeNode));
	}

	@Test
	public void test_empty() {
		Assertions.assertTrue(balancedBinaryTree.isBalanced(null));
	}

	@Test
	public void test1_2_2_3_null_null_3_4_null_null_4() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(3,
								new TreeNode(4),
								null),
						null),
				new TreeNode(2,
						null,
						new TreeNode(3,
								null,
								new TreeNode(4))));

		Assertions.assertFalse(balancedBinaryTree.isBalanced(treeNode));
	}

}