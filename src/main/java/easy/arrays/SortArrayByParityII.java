package easy.arrays;

//922. Sort Array By Parity II (Easy)
public class SortArrayByParityII {

	public int[] sortArrayByParityII(int[] nums) {
		int k = 0;
		int n = 0;

		int[] even = new int[nums.length / 2];
		int[] odd = new int[nums.length / 2];

		for (int num : nums) {
			if (num % 2 == 0) {
				even[k++] = num;
			} else {
				odd[n++] = num;
			}
		}

		k = 0;
		n = 0;
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (k < even.length && i % 2 == 0) {
				result[i] = even[k++];
			}
			if (n < odd.length && i % 2 != 0) {
				result[i] = odd[n++];
			}
		}

		return result;
	}

}
