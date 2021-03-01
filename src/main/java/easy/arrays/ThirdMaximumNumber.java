package easy.arrays;

import java.util.Arrays;

//414. Third Maximum Number (Easy)
public class ThirdMaximumNumber {

	public int thirdMax(int[] nums) {
		int[] res = Arrays.stream(nums).distinct().toArray();
		Arrays.sort(res);

		if (res.length == 1) {
			return res[0];
		}
		if (res.length == 2) {
			return Math.max(res[0], res[1]);
		}

		return res[res.length - 3];
	}

}
