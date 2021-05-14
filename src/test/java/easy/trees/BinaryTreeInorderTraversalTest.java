package easy.trees;

import easy.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class BinaryTreeInorderTraversalTest {

	private final BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

	@Test
	void test1_null_23() {
		TreeNode root = new TreeNode(1, null,
				new TreeNode(2,
						new TreeNode(3, null, null),
						null));

		Assertions.assertEquals(Arrays.asList(1, 3, 2), binaryTreeInorderTraversal.inorderTraversal(root));
	}

	@Test
	void test_empty() {
		Assertions.assertEquals(Collections.emptyList(), binaryTreeInorderTraversal.inorderTraversal(null));
	}

	@Test
	void test_1() {
		TreeNode root = new TreeNode(1, null, null);

		Assertions.assertEquals(Collections.singletonList(1), binaryTreeInorderTraversal.inorderTraversal(root));
	}

	@Test
	void test12() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2, null, null),
				null);

		Assertions.assertEquals(Arrays.asList(2, 1), binaryTreeInorderTraversal.inorderTraversal(root));
	}

	@Test
	void test1_null_2() {
		TreeNode root = new TreeNode(1,
				null,
				new TreeNode(2, null, null));

		Assertions.assertEquals(Arrays.asList(1, 2), binaryTreeInorderTraversal.inorderTraversal(root));
	}

}