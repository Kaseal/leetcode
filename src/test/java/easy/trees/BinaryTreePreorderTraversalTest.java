package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class BinaryTreePreorderTraversalTest {

	private final BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

	@Test
	void test1() {
		TreeNode treeNode = new TreeNode(1,
				null,
				new TreeNode(2,
						new TreeNode(3),
						null));

		List<Integer> expectedList = Arrays.asList(1, 2, 3);

		Assertions.assertEquals(expectedList, binaryTreePreorderTraversal.preorderTraversal(treeNode));
	}

	@Test
	void test2() {
		Assertions.assertEquals(Collections.EMPTY_LIST, binaryTreePreorderTraversal.preorderTraversal(null));
	}

	@Test
	void test3() {
		TreeNode treeNode = new TreeNode(1);

		List<Integer> expectedList = Collections.singletonList(1);

		Assertions.assertEquals(expectedList, binaryTreePreorderTraversal.preorderTraversal(treeNode));
	}


}