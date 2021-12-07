package medium.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumIIITest {

	private final PathSumIII pathSumIII = new PathSumIII();

	@Test
	public void test10_5_minus3_3_2_null_11_3_minus2_null_1__8() {
		TreeNode treeNode = new TreeNode(10,
				new TreeNode(5,
						new TreeNode(3,
								new TreeNode(3),
								new TreeNode(-2)),
						new TreeNode(2,
								null,
								new TreeNode(1))),
				new TreeNode(-3,
						null,
						new TreeNode(11)));

		Assertions.assertEquals(3, pathSumIII.pathSum(treeNode, 8));
	}

	@Test
	public void test5_4_8_11_null_13_4_7_2_null_null_5_1__22() {
		TreeNode treeNode = new TreeNode(5,
				new TreeNode(4,
						new TreeNode(11,
								new TreeNode(7),
								new TreeNode(2)),
						null),
				new TreeNode(8,
						new TreeNode(13),
						new TreeNode(4,
								new TreeNode(5),
								new TreeNode(1))));

		Assertions.assertEquals(3, pathSumIII.pathSum(treeNode, 22));
	}

	@Test
	public void test1__0() {
		TreeNode treeNode = new TreeNode(1);

		Assertions.assertEquals(0, pathSumIII.pathSum(treeNode, 0));
	}

	@Test
	public void test0_1_1__1() {
		TreeNode treeNode = new TreeNode(0,
				new TreeNode(1),
				new TreeNode(1));

		Assertions.assertEquals(4, pathSumIII.pathSum(treeNode, 1));
	}

	@Test
	public void test1__1() {
		TreeNode treeNode = new TreeNode(1);

		Assertions.assertEquals(1, pathSumIII.pathSum(treeNode, 1));
	}

	@Test
	public void test1_2__1() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2),
				null);

		Assertions.assertEquals(1, pathSumIII.pathSum(treeNode, 1));
	}

	@Test
	public void test0_1_1__0() {
		TreeNode treeNode = new TreeNode(0,
				new TreeNode(1),
				new TreeNode(1));

		Assertions.assertEquals(1, pathSumIII.pathSum(treeNode, 0));
	}

}