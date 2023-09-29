package medium.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//229. Majority Element II (Medium)
public class MajorityElementII {

	public List<Integer> majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int num : nums) {
			Integer integer = hm.computeIfPresent(num, (key, value) -> value + 1);

			if (integer == null) {
				hm.put(num, 1);
			}
		}

		return hm.entrySet().stream()
				.filter(entry -> entry.getValue() > nums.length / 3)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

}
