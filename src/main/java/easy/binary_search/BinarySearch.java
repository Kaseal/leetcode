package easy.binary_search;

//704. Binary Search (Easy)
public class BinarySearch {

	public int search(int[] nums, int target) {
		if (nums.length == 1) {
			return nums[0] == target ? 0 : -1;
		}

		int left = 0;
		int right = nums.length - 1;
		int pivot = nums.length / 2;

		while (left <= right) {
			if (nums[pivot] == target) {
				return pivot;
			} else {
				if (nums[pivot] < target) {
					left = pivot + 1;
				} else {
					right = pivot - 1;
				}
				pivot = left + (right - left);
			}
		}

		return -1;
	}

}
