package easy.arrays;

//167. Two Sum II - Input Array Is Sorted (Easy)
public class TwoSumIIInputArrayIsSorted {

	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				return new int[]{++left, ++right};
			}
			if (numbers[left] + numbers[right] < target) {
				left++;
			} else {
				right--;
			}
		}

		return null;
	}

}
