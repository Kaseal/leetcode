package easy;

import easy.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest {

	private final SymmetricTree symmetricTree = new SymmetricTree();

	@Test
	public void test1223443() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));

		Assert.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test122null3null3() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, null, new TreeNode(3)));

		Assert.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test1222null2() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, new TreeNode(2), null),
				new TreeNode(2, new TreeNode(2), null));

		Assert.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test10() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(0), null);

		Assert.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test_null() {
		Assert.assertTrue(symmetricTree.isSymmetric(null));
	}

	@Test
	public void test1() {
		TreeNode treeNode1 = new TreeNode(1);

		Assert.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test541null1null42null2null() {
		TreeNode treeNode1 = new TreeNode(5, new TreeNode(4, null,
				new TreeNode(1, new TreeNode(2), null)), new TreeNode(1,
				null, new TreeNode(4, new TreeNode(2), null)));

		Assert.assertFalse(symmetricTree.isSymmetric(treeNode1));
	}

	@Test
	public void test122null33() {
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, new TreeNode(3), null));

		Assert.assertTrue(symmetricTree.isSymmetric(treeNode1));
	}

}