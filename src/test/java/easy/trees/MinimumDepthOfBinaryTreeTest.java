package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {

	private final MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();

	@Test
	public void test3_9_20_null_null_15_7() {
		TreeNode treeNode = new TreeNode(3,
				new TreeNode(9),
				new TreeNode(20,
						new TreeNode(15),
						new TreeNode(7)));

		Assert.assertEquals(2, minimumDepthOfBinaryTree.minDepth(treeNode));
	}

	@Test
	public void test2_null_3_null_4_null_5_null_6() {
		TreeNode treeNode = new TreeNode(2,
				null,
				new TreeNode(3,
						null,
						new TreeNode(4,
								null,
								new TreeNode(5,
										null,
										new TreeNode(6)))));

		Assert.assertEquals(5, minimumDepthOfBinaryTree.minDepth(treeNode));
	}

	@Test
	public void test_minis9_minus3_2_null_4_4_0_minus6_null_minus5() {
		TreeNode treeNode = new TreeNode(-9,
				new TreeNode(-3,
						null,
						new TreeNode(4,
								new TreeNode(-6),
								null)),
				new TreeNode(2,
						new TreeNode(4,
								new TreeNode(-5),
								null),
						new TreeNode(0)));

		Assert.assertEquals(3, minimumDepthOfBinaryTree.minDepth(treeNode));
	}

}