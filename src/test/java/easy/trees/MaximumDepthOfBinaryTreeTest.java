package easy.trees;

import easy.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

	private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

	@Test
	public void test39_20_null_null_15_7() {
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		Assert.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));
	}

	@Test
	public void test1_null_2() {
		TreeNode root = new TreeNode(1, null, new TreeNode(2));

		Assert.assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
	}

	@Test
	public void test_null() {
		Assert.assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));
	}

	@Test
	public void test0() {
		TreeNode root = new TreeNode(0);

		Assert.assertEquals(1, maximumDepthOfBinaryTree.maxDepth(root));
	}

}