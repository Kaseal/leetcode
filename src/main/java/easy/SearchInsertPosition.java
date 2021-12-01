package easy;

//35. Search Insert Position (Easy)
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target || nums[i] - 1 == target) {
				return i;
			} else if (nums[i] + 1 == target) {
				return i + 1;
			} else if (nums[i] > target) {
				return 0;
			}
		}
		return nums.length;
	}

	public int _searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int mid = nums.length / 2;

		while (left <= right) {
			if (nums[mid] == target) {
				return mid;
			} else {
				if (nums[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
				mid = left + (right - left) / 2;
			}
		}

		return mid;
	}

}
