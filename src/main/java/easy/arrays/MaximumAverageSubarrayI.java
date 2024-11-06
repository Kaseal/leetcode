package easy.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

//643. Maximum Average Subarray I (Easy)
public class MaximumAverageSubarrayI {

	public double findMaxAverage(int[] nums, int k) {
		double max;
		if (nums.length < k) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		double currentSum = 0;
		int i = 0;

		for (int j = 0; j < nums.length && j < k; j++) {
			currentSum += nums[j];
		}

		max = currentSum / k;
		i++;

		while (i + k <= nums.length) {
			currentSum -= nums[i - 1];
			currentSum += nums[i + k - 1];
			max = Math.max(max, currentSum / k);
			i++;
		}

		return new BigDecimal(max).setScale(5, RoundingMode.HALF_EVEN).doubleValue();
	}

}
