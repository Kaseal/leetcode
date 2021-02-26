package easy.arrays;

//1470. Shuffle the Array (Easy)
public class ShuffleTheArray {

	public int[] shuffle(int[] nums, int n) {
		int[] res = new int[nums.length];

		int k = 0;
		for (int i = 0; i < n; i++) {
			res[i + k] = nums[i];
			res[i + k + 1] = nums[i + n];
			k++;
		}

		return res;
	}

}
