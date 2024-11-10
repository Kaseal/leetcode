package medium;

import java.util.Arrays;

//1679. Max Number of K-Sum Pairs (Medium)
public class MaxNumberOfKSumPairs {

	public int maxOperations(int[] nums, int k) {
		int numberOfOperations = 0;

		nums = Arrays.stream(nums).filter(e -> e < k).sorted().toArray();

		int i = 0;
		int j = nums.length - 1;

		while (i < nums.length - 1 && j >= 0) {
			if (nums[i] != -1 && nums[j] != -1 && i != j) {
				if (nums[i] + nums[j] == k) {
					numberOfOperations++;
					nums[i] = -1;
					nums[j] = -1;
					i++;
					j--;
				} else if (nums[i] + nums[j] > k) {
					j--;
				} else {
					i++;
				}
			} else if (nums[i] == -1) {
				i++;
			} else {
				j--;
			}
		}

		return numberOfOperations;
	}

}
