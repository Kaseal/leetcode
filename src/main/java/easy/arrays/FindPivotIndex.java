package easy.arrays;

import java.util.Arrays;

//724. Find Pivot Index (Easy)
public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		if (nums.length == 2) {
			if (nums[1] == 0) {
				return 0;
			} else if (nums[0] == 0) {
				return 1;
			}
		}

		int rightSum  = Arrays.stream(nums).sum() - nums[0];
		int leftSum = nums[0];

		if (rightSum == 0) {
			return 0;
		}

		int i = 1;
		while (i < nums.length) {
			if (i == nums.length - 1 && leftSum == 0) {
				return i;
			}
			rightSum -= nums[i];
			if (rightSum == leftSum) {
				return i;
			}
			leftSum += nums[i];

			i++;
		}

		return -1;
	}

}
