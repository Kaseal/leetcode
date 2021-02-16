package easy.arrays;

//1480. Running Sum of 1d Array (Easy)
public class RunningSumOf1dArray {

	public int[] runningSum(int[] nums) {
		int[] resultNums = new int[nums.length];
		int curSum = 0;
		for (int i = 0; i < nums.length; i++) {
			curSum += nums[i];
			resultNums[i] = curSum;
		}

		return resultNums;
	}

}
