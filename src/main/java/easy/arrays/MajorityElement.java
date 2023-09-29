package easy.arrays;

//169. Majority Element (Easy)
public class MajorityElement {

	public int majorityElement(int[] nums) {
		int majorityElement = nums[0];
		int counter = 0;

		for (int num : nums) {
			if (majorityElement == num) {
				counter++;
			} else if (--counter < 0) {
				counter++;
				majorityElement = num;
			}
		}

		return majorityElement;
	}

}
