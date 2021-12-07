package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

	private final SymmetricTree symmetricTree = new SymmetricTree();

	@Test
	public void test1223443() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));

		Assertions.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test122null3null3() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, null, new TreeNode(3)));

		Assertions.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test1222null2() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, new TreeNode(2), null),
				new TreeNode(2, new TreeNode(2), null));

		Assertions.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test10() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(0), null);

		Assertions.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test_null() {
		Assertions.assertTrue(symmetricTree.isSymmetric(null));
	}

	@Test
	public void test1() {
		TreeNode treeNode1 = new TreeNode(1);

		Assertions.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test541null1null42null2null() {
		TreeNode treeNode1 = new TreeNode(5, new TreeNode(4, null,
				new TreeNode(1, new TreeNode(2), null)), new TreeNode(1,
				null, new TreeNode(4, new TreeNode(2), null)));

		Assertions.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test122null33() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, new TreeNode(3), null));

		Assertions.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

}