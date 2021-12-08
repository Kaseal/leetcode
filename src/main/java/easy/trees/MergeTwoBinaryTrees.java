package easy.trees;

import common.helper_classes.TreeNode;

import java.util.Stack;

//617. Merge Two Binary Trees (Easy)
public class MergeTwoBinaryTrees {

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return root2;
		}
		if (root2 == null) {
			return root1;
		}

		Stack<TreeNode[]> stack = new Stack<>();
		stack.push(new TreeNode[]{root1, root2});

		while (!stack.isEmpty()) {
			TreeNode[] treeNodes = stack.pop();
			TreeNode tn1 = treeNodes[0];
			TreeNode tn2 = treeNodes[1];

			tn1.val += tn2.val;
			if (tn1.left != null && tn2.left != null) {
				stack.push(new TreeNode[]{tn1.left, tn2.left});
			} else if (tn1.left == null) {
				tn1.left = tn2.left;
			}
			if (tn1.right != null && tn2.right != null) {
				stack.push(new TreeNode[]{tn1.right, tn2.right});
			} else if (tn1.right == null) {
				tn1.right = tn2.right;
			}
		}

		return root1;
	}

	public TreeNode _mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return root2;
		}
		if (root2 == null) {
			return root1;
		}
		root1.val += root2.val;

		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);

		return root1;
	}

}
