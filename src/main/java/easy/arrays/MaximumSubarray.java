package easy.arrays;

//@Hard
//53. Maximum Subarray (Easy)
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int curSum = 0;
			for (int j = i; j < nums.length; j++) {
				curSum += nums[j];
				maxSum = Math.max(curSum, maxSum);
			}
		}

		return maxSum;
	}

}
