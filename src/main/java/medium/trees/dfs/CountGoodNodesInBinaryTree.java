package medium.trees.dfs;

import common.helper_classes.TreeNode;

import java.util.Collections;
import java.util.Stack;

//1448. Count Good Nodes in Binary Tree (Medium)
public class CountGoodNodesInBinaryTree {
	Stack<Integer> stack = new Stack<>();
	Integer i = new Integer(0);

	public int goodNodes(TreeNode root) {
		if (root.left == null && root.right == null) {
			return 1;
		}

		dfs(root);

		return i;
	}

	private void dfs(TreeNode node) {
		if (node == null) {
			return;
		}

		stack.push(node.val);

		dfs(node.left);
		dfs(node.right);

		int curr = stack.pop();
		if (stack.size() == 0) {
			i += 1;
		} else {
			int maxValue = Collections.max(stack);
			if (curr >= maxValue) {
				i += 1;
			}
		}
	}

}
