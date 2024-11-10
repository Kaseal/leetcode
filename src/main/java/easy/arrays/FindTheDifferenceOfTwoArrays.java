package easy.arrays;

import java.util.ArrayList;
import java.util.List;

//2215. Find the Difference of Two Arrays (Easy)
public class FindTheDifferenceOfTwoArrays {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<Integer> list1 = new ArrayList<>();
		for (int k : nums1) {
			boolean shouldBeAdded = true;

			for (int i : nums2) {
				if (k == i) {
					shouldBeAdded = false;
					break;
				}
			}

			if (shouldBeAdded && !list1.contains(k)) {
				list1.add(k);
			}
		}

		List<Integer> list2 = new ArrayList<>();
		for (int k : nums2) {
			boolean shouldBeAdded = true;

			for (int i : nums1) {
				if (k == i) {
					shouldBeAdded = false;
					break;
				}
			}

			if (shouldBeAdded && !list2.contains(k)) {
				list2.add(k);
			}
		}

		List<List<Integer>> result = new ArrayList<>();
		result.add(list1);
		result.add(list2);

		return result;
	}

}
