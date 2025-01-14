package easy.trees.dfs;

import common.helper_classes.TreeNode;

//104. Maximum Depth of Binary Tree (Easy)
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
