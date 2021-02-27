package easy.arrays;

//1365. How Many Numbers Are Smaller Than the Current Number (Easy)
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] res = new int[nums.length];
		int k = 0;
		int count;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[j] < nums[i]) {
					count++;
				}
			}
			res[k++] = count;
		}

		return res;
	}

}
