package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class BinaryTreePostorderTraversalTest {

	private final BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

	@Test
	void test1() {
		TreeNode treeNode = new TreeNode(1,
				null,
				new TreeNode(2,
						new TreeNode(3),
						null));

		List<Integer> expectedList = Arrays.asList(3, 2, 1);

		Assertions.assertEquals(expectedList, binaryTreePostorderTraversal.postorderTraversal(treeNode));
	}

	@Test
	void test2() {
		Assertions.assertEquals(Collections.EMPTY_LIST, binaryTreePostorderTraversal.postorderTraversal(null));
	}

	@Test
	void test3() {
		TreeNode treeNode = new TreeNode(1);

		List<Integer> expectedList = Collections.singletonList(1);

		Assertions.assertEquals(expectedList, binaryTreePostorderTraversal.postorderTraversal(treeNode));
	}

}