package easy.arrays;

//26. Remove Duplicates from Sorted Array (Easy)
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		int len = 1;

		int currentNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != currentNum) {
				nums[len] = nums[i];
				currentNum = nums[i];
				len++;
			}
		}

		return len;
	}

}
