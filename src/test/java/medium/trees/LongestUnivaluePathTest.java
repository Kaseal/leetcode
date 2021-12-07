package medium.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestUnivaluePathTest {

	private final LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();

	@Test
	public void test5_4_5_1_5() {
		TreeNode treeNode = new TreeNode(5,
				new TreeNode(4,
						new TreeNode(1),
						new TreeNode(1)),
				new TreeNode(5,
						new TreeNode(5),
						null));

		Assertions.assertEquals(2, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

	@Test
	public void test1_4_5_4_4_5() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(4,
						new TreeNode(4),
						new TreeNode(4)),
				new TreeNode(5,
						new TreeNode(5),
						null));

		Assertions.assertEquals(2, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

	@Test
	public void test1() {
		TreeNode treeNode = new TreeNode(1);

		Assertions.assertEquals(0, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

	@Test
	public void test1_2_2_2_2() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(2),
						new TreeNode(2)),
				new TreeNode(2));

		Assertions.assertEquals(2, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

	@Test
	public void test1_2_2_2_2_2() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(2),
						new TreeNode(2)),
				new TreeNode(2,
						new TreeNode(2),
						null));

		Assertions.assertEquals(2, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

	@Test
	public void test_empty() {
		Assertions.assertEquals(0, longestUnivaluePath.longestUnivaluePath(null));
	}

	@Test
	public void test1_null_1_1_1_1_1_1() {
		TreeNode treeNode = new TreeNode(1,
				null,
				new TreeNode(1,
						new TreeNode(1,
								new TreeNode(1),
								new TreeNode(1)),
						new TreeNode(1,
								new TreeNode(1),
								null)));

		Assertions.assertEquals(4, longestUnivaluePath.longestUnivaluePath(treeNode));
	}

}