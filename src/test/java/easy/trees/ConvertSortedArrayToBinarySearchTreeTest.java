package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

	private final ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree =
			new ConvertSortedArrayToBinarySearchTree();

	@Test
	public void testMinus10_minus3_059() {
		int[] nums = {-10, -3, 0, 5, 9};

		TreeNode expectedTreeNode = new TreeNode(0, new TreeNode(-10, null, new TreeNode(-3)),
				new TreeNode(5, null, new TreeNode(9)));

		Assert.assertTrue(TreeNode.isSameTree(expectedTreeNode, convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums)));
	}

	@Test
	public void testMinus3_0() {
		int[] nums = {-3, 0};

		TreeNode expectedTreeNode = new TreeNode(-3, null, new TreeNode(0));

		Assert.assertTrue(TreeNode.isSameTree(expectedTreeNode, convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums)));
	}

	@Test
	public void test0() {
		int[] nums = {0};

		TreeNode expectedTreeNode = new TreeNode(0);

		Assert.assertTrue(TreeNode.isSameTree(expectedTreeNode, convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums)));
	}

	@Test
	public void testMinus1_012() {
		int[] nums = {-1, 0, 1, 2};

		TreeNode expectedTreeNode = new TreeNode(0, new TreeNode(-1), new TreeNode(1, null, new TreeNode(2)));

		Assert.assertTrue(TreeNode.isSameTree(expectedTreeNode, convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums)));
	}

	@Test
	public void test0123456() {
		int[] nums = {0, 1, 2, 3, 4, 5};

		TreeNode expectedTreeNode = new TreeNode(2, new TreeNode(0, null, new TreeNode(1)),
				new TreeNode(4, new TreeNode(3), new TreeNode(5)));

		Assert.assertTrue(TreeNode.isSameTree(expectedTreeNode, convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums)));
	}

}