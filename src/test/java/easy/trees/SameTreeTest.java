package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

	private final SameTree sameTree = new SameTree();

	@Test
	public void test123_123() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		Assert.assertTrue(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test12_1null2() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), null);
		TreeNode treeNode2 = new TreeNode(1, null, new TreeNode(2));

		Assert.assertFalse(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test121_112() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));

		Assert.assertFalse(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test__null_null() {
		Assert.assertTrue(sameTree.isSameTree(null, null));
	}

}