package medium.arrays;

//238. Product of Array Except Self (Medium)
public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];

		int product = 1;
		int zeroCount = 0;
		int zeroPosition = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				product *= nums[i];
			} else {
				zeroCount++;
				if (zeroCount == 1) {
					zeroPosition = i;
				}
			}
		}

		if (zeroCount == 0) {
			for (int j = 0; j < nums.length; j++) {
				result[j] = product / nums[j];
			}
		} else if (zeroCount == 1) {
			result[zeroPosition] = product;
		}

		return result;
	}

}
