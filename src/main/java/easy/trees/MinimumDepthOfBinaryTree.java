package easy.trees;

import common.helper_classes.TreeNode;

//111. Minimum Depth of Binary Tree (Easy)
public class MinimumDepthOfBinaryTree {

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int d1 = minDepth(root.left);
		int d2 = minDepth(root.right);

		return d1 == 0 || d2 == 0 ? Math.max(d1, d2) + 1 : Math.min(d1, d2) + 1;
	}

}
