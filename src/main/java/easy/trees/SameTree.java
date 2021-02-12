package easy.trees;

import easy.helper_classes.TreeNode;

//100. Same Tree (Easy)
public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		if (p != null && q != null && p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}

		return false;
	}

	public boolean _isSameTree(TreeNode p, TreeNode q) {
		StringBuilder result1 = new StringBuilder();
		StringBuilder result2 = new StringBuilder();

		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		}

		examine(p, result1);
		examine(q, result2);

		return result1.toString().equals(result2.toString());
	}

	private void examine(TreeNode p, StringBuilder result) {
		result.append(p.val);
		if (p.left != null) {
			examine(p.left, result);
		} else {
			result.append("_ln_");
		}
		if (p.right != null) {
			examine(p.right, result);
		} else {
			result.append("_rn_");
		}
	}

}
