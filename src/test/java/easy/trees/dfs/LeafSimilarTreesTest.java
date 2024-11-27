package easy.trees.dfs;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeafSimilarTreesTest {

	private final LeafSimilarTrees instance = new LeafSimilarTrees();

	@Test
	void test1() {
		TreeNode input1 = new TreeNode(3,
				new TreeNode(5,
						new TreeNode(6), new TreeNode(2,
						new TreeNode(7), new TreeNode(4))),
				new TreeNode(1,
						new TreeNode(9), new TreeNode(8)));

		TreeNode input2 = new TreeNode(3,
				new TreeNode(5,
						new TreeNode(6), new TreeNode(7)),
				new TreeNode(1,
						new TreeNode(4), new TreeNode(2,
						new TreeNode(9), new TreeNode(8))));

		Assertions.assertTrue(instance.leafSimilar(input1, input2));
	}

	@Test
	void test2() {
		TreeNode input1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		TreeNode input2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

		Assertions.assertFalse(instance.leafSimilar(input1, input2));
	}

}