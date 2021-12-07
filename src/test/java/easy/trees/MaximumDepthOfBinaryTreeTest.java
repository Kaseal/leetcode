package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {

	private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

	@Test
	public void test39_20_null_null_15_7() {
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
	}

	@Test
	public void test1_null_2() {
		TreeNode root = new TreeNode(1, null, new TreeNode(2));

		Assertions.assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
	}

	@Test
	public void test_null() {
		Assertions.assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));
	}

	@Test
	public void test0() {
		TreeNode root = new TreeNode(0);

		Assertions.assertEquals(1, maximumDepthOfBinaryTree.maxDepth(root));
	}

}