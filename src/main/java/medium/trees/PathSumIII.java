package medium.trees;

import easy.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//437. Path Sum III (Medium)
public class PathSumIII {

	public int pathSum(TreeNode root, int sum) {
		return getBranches(root, new ArrayList<Integer>(), sum);
	}

	private int getBranches(TreeNode node, List<Integer> list, int targetSum) {
		if (node == null) {
			return 0;
		}

		list.add(node.val);

		int size = list.size();
		int sum = 0;
		int count = 0;

		while (size-- > 0) {
			sum += list.get(size);
			if (sum == targetSum) {
				count++;
			}
		}

		count += getBranches(node.left, list, targetSum);
		count += getBranches(node.right, list, targetSum);

		list.remove(list.size() - 1);

		return count;
	}

}
