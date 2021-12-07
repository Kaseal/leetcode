package easy.trees;

import common.helper_classes.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIITest {

	private final BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();

	@Test
	public void test39_20_null_null_15_7() {
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		List<Integer> list1 = new ArrayList<>();
		list1.add(15);
		list1.add(7);
		List<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(20);
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);

		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(list1);
		expectedList.add(list2);
		expectedList.add(list3);

		Assertions.assertEquals(expectedList, binaryTreeLevelOrderTraversalII.levelOrderBottom(root));
	}

	@Test
	public void test1() {
		TreeNode root = new TreeNode(1);

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);

		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(list1);

		Assertions.assertEquals(expectedList, binaryTreeLevelOrderTraversalII.levelOrderBottom(root));
	}

	@Test
	public void test1234_null_null_5() {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
				new TreeNode(3, null, new TreeNode(5)));

		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(5);
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);

		List<List<Integer>> expectedList = new ArrayList<>();
		expectedList.add(list1);
		expectedList.add(list2);
		expectedList.add(list3);

		Assertions.assertEquals(expectedList, binaryTreeLevelOrderTraversalII.levelOrderBottom(root));
	}

	@Test
	public void testEmpty() {
		List<List<Integer>> expectedList = new ArrayList<>();

		Assertions.assertEquals(expectedList, binaryTreeLevelOrderTraversalII.levelOrderBottom(null));
	}

}