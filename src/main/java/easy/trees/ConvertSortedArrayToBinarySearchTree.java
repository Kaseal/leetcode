package easy.trees;

import common.helper_classes.TreeNode;

//@Hard
//108. Convert Sorted Array to Binary Search Tree (Easy)
public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}

		return nextNode(0, nums.length - 1, nums);
	}

	private TreeNode nextNode(int left, int right, int[] nums) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;

		TreeNode treeNode = new TreeNode(nums[mid]);

		treeNode.left = nextNode(left, mid - 1, nums);
		treeNode.right = nextNode(mid + 1, right, nums);

		return treeNode;
	}

}
