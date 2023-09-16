package easy.trees;

import common.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//145. Binary Tree Postorder Traversal (Easy)
public class BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();

		traverse(root, list);

		return list;
	}

	private void traverse(TreeNode treeNode, List<Integer> list) {
		if (treeNode != null && treeNode.left != null) {
			traverse(treeNode.left, list);
		}

		if (treeNode != null && treeNode.right != null) {
			traverse(treeNode.right, list);
		}

		if (treeNode != null) {
			list.add(treeNode.val);
		}
	}

}
