package easy.arrays;

//219. Contains Duplicate II (Easy)
public class ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int iter = 1;
			while (j < nums.length && iter <= k) {
				if (nums[i] == nums[j]) {
					return true;
				}
				j++;
				iter++;
			}
		}

		return false;
	}

}
