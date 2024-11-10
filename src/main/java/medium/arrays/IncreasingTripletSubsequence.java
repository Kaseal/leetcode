package medium.arrays;

//334. Increasing Triplet Subsequence (Medium)
public class IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] nums) {
		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MAX_VALUE;
		int n3 = Integer.MAX_VALUE;
		boolean allInitialized = false;

		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				n1 = Math.min(n1, nums[i]);
			}

			if (i == 1) {
				n1 = Math.min(n1, nums[i - 1]);
				if (nums[i] > n1) {
					n2 = Math.min(n2, nums[i]);
				}
			}

			if (i > 1) {
				n1 = Math.min(n1, nums[i - 2]);
				if (nums[i - 1] > n1) {
					n2 = Math.min(n2, nums[i - 1]);
				}
				if (nums[i] > n2) {
					n3 = Math.min(n3, nums[i]);
					allInitialized = true;
				}
			}

			if (n1 < n2 && n2 < n3 && allInitialized) {
				return true;
			}
		}

		return false;
	}

}
