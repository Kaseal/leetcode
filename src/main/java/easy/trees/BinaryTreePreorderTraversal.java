package easy.trees;

import common.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//144. Binary Tree Preorder Traversal (Easy)
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();

		traverse(root, list);

		return list;
	}

	private void traverse(TreeNode treeNode, List<Integer> list) {
		if (treeNode != null) {
			list.add(treeNode.val);
		} else {
			return;
		}

		if (treeNode.left != null) {
			traverse(treeNode.left, list);
		}

		if (treeNode.right != null) {
			traverse(treeNode.right, list);
		}
	}

}
