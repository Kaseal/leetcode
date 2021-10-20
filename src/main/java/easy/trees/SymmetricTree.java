package easy.trees;

import common.helper_classes.TreeNode;

//101. Symmetric Tree (Easy)
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return examine(root.left, root.right);
	}

	private boolean examine(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left != null && right != null && left.val == right.val) {
			return examine(left.left, right.right) && examine(left.right, right.left);
		}

		return false;
	}

}
