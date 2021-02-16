package medium.trees;

import easy.helper_classes.TreeNode;

//687. Longest Univalue Path (Medium)
public class LongestUnivaluePath {

	private int result = 0;

	public int longestUnivaluePath(TreeNode root) {
		pathLength(root);
		return result;
	}

	private int pathLength(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = pathLength(node.left);
		int right = pathLength(node.right);

		int currentLeft = 0;
		int currentRight = 0;
		if (node.left != null && node.left.val == node.val) {
			currentLeft += left + 1;
		}

		if (node.right != null && node.right.val == node.val) {
			currentRight += right + 1;
		}

		result = Math.max(result, currentLeft + currentRight);

		return Math.max(currentLeft, currentRight);
	}

}
