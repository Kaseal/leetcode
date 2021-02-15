package medium.trees;

import easy.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//113. Path Sum II (Medium)
public class PathSumII {

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> resultList = new ArrayList<>();

		findList(root, targetSum, list, resultList);

		return resultList;
	}

	private void findList(TreeNode node, int targetSum, List<Integer> list, List<List<Integer>> resultList) {
		if (node == null) {
			return;
		}

		list.add(node.val);
		targetSum -= node.val;
		if (node.left == null && node.right == null && targetSum == 0) {
			resultList.add(new ArrayList<>(list));
		}

		findList(node.left, targetSum, list, resultList);
		findList(node.right, targetSum, list, resultList);

		list.remove(list.size() - 1);
	}

}
