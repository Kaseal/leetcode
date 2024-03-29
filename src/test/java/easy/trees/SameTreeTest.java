package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

	private final SameTree sameTree = new SameTree();

	@Test
	public void test123_123() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		Assertions.assertTrue(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test12_1null2() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), null);
		TreeNode treeNode2 = new TreeNode(1, null, new TreeNode(2));

		Assertions.assertFalse(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test121_112() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));

		Assertions.assertFalse(sameTree.isSameTree(treeNode1, treeNode2));
	}

	@Test
	public void test__null_null() {
		Assertions.assertTrue(sameTree.isSameTree(null, null));
	}

}