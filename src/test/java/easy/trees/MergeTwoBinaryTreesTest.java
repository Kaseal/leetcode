package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoBinaryTreesTest {

	private final MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();

	@Test
	public void test1() {
		TreeNode treeNode1 = new TreeNode(1,
				new TreeNode(3, new TreeNode(5), null),
				new TreeNode(2));

		TreeNode treeNode2 = new TreeNode(2,
				new TreeNode(1, null, new TreeNode(4)),
				new TreeNode(3, null, new TreeNode(7)));

		TreeNode treeNodeExpected = new TreeNode(3,
				new TreeNode(4, new TreeNode(5), new TreeNode(4)),
				new TreeNode(5, null, new TreeNode(7)));

		Assertions.assertTrue(TreeNode.isSameTree(treeNodeExpected, mergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2)));
	}

	@Test
	public void test2() {
		TreeNode treeNode1 = new TreeNode(1);

		TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), null);

		TreeNode treeNodeExpected = new TreeNode(2, new TreeNode(2), null);

		Assertions.assertTrue(TreeNode.isSameTree(treeNodeExpected, mergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2)));
	}

	@Test
	void test3() {
		TreeNode treeNode1 = new TreeNode(1);

		TreeNode treeNodeExpected = new TreeNode(1);

		Assertions.assertTrue(TreeNode.isSameTree(treeNodeExpected, mergeTwoBinaryTrees.mergeTrees(treeNode1, null)));
	}

}