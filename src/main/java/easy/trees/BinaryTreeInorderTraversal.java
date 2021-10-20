package easy.trees;

import common.helper_classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

//94. Binary Tree Inorder Traversal (Easy)
public class BinaryTreeInorderTraversal {

	private final List<Integer> list = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}

		if (root.left != null) {
			inorderTraversal(root.left);
		}

		list.add(root.val);

		if (root.right != null) {
			inorderTraversal(root.right);
		}

		return list;
	}

}
