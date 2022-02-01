package medium.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//46. Permutations (Medium)
public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();

		ArrayList<Integer> list = new ArrayList<>();
		for (int num : nums) {
			list.add(num);
		}

		backtrack(res, list, 0);

		return res;
	}

	private void backtrack(List<List<Integer>> res, List<Integer> nums, int first) {
		if (first == nums.size()) {
			res.add(new ArrayList<>(nums));
		}

		for (int i = first; i < nums.size(); i++) {
			Collections.swap(nums, first, i);
			backtrack(res, nums, first + 1);
			Collections.swap(nums, first, i);
		}

	}

}
