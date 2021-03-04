package easy.arrays;

//1486. XOR Operation in an Array (Easy)
public class XOROperationInAnArray {

	public int xorOperation(int n, int start) {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = start + 2 * i;
		}

		int res = 0;
		for (int i = 0; i < n; i++) {
			res ^= nums[i];
		}

		return res;
	}

}
