package medium.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathSumIITest {

	private final PathSumII pathSumII = new PathSumII();

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

		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(Arrays.asList(5, 4, 11, 2));
		expectedList.add(Arrays.asList(5, 8, 4, 5));

		Assertions.assertEquals(expectedList, pathSumII.pathSum(treeNode, 22));
	}

	@Test
	public void test1_2_3__5() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2),
				new TreeNode(3));

		List<List<Integer>> expectedList = new ArrayList<>();

		Assertions.assertEquals(expectedList, pathSumII.pathSum(treeNode, 5));
	}

	@Test
	public void test1_2__0() {
		TreeNode treeNode = new TreeNode(1,
				new TreeNode(2),
				null);

		List<List<Integer>> expectedList = new ArrayList<>();

		Assertions.assertEquals(expectedList, pathSumII.pathSum(treeNode, 0));
	}

}