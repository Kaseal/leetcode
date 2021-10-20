package easy.trees;

import common.helper_classes.TreeNode;

//112. Path Sum (Easy)
public class PathSum {

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}

		targetSum -= root.val;
		if (root.left == null && root.right == null && targetSum == 0) {
			return true;
		}

		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
	}

}
