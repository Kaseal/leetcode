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

}
