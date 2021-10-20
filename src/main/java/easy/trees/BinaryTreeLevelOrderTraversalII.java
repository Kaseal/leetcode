package easy.trees;

import common.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//107. Binary Tree Level Order Traversal II (Easy)
public class BinaryTreeLevelOrderTraversalII {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();

		if (root == null) {
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			List<Integer> currentList = new ArrayList<>();
			int currentQueueSize = queue.size();
			for (int i = 0; i < currentQueueSize; i++) {
				TreeNode treeNode = queue.poll();
				if (treeNode != null) {
					currentList.add(treeNode.val);
					if (treeNode.left != null) {
						queue.offer(treeNode.left);
					}
					if (treeNode.right != null) {
						queue.offer(treeNode.right);
					}
				}
			}
			list.add(0, currentList);
		}

		return list;
	}

}
