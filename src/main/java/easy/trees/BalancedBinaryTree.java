package easy.trees;

import common.helper_classes.TreeNode;

//110. Balanced Binary Tree (Easy)
public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		int d1 = maxDepth(root.left);
		int d2 = maxDepth(root.right);

		if (Math.max(d1, d2) - Math.min(d1, d2) > 1) {
			return false;
		}

		return isBalanced(root.left) && isBalanced(root.right);
	}

	private int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
