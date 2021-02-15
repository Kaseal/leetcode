package easy.trees;

import easy.helper_classes.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class PathSumTest {

	private final PathSum pathSum = new PathSum();

	@Test
	public void test5_4_8_11_null_13_4_7_2_null_null_null_1__22() {
		TreeNode treeNode = new TreeNode(5,
				new TreeNode(4,
						new TreeNode(11,
								new TreeNode(7),
								new TreeNode(2)),
						null),
				new TreeNode(8,
						new TreeNode(13),
						new TreeNode(4,
								null,
								new TreeNode(1))));

		Assert.assertTrue(pathSum.hasPathSum(treeNode, 22));
	}

	@Test
	public void test1_2_3__5() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2),
				new TreeNode(3));

		Assert.assertFalse(pathSum.hasPathSum(treeNode, 5));
	}

	@Test
	public void test1_2__0() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2),
				null);

		Assert.assertFalse(pathSum.hasPathSum(treeNode, 0));
	}

}