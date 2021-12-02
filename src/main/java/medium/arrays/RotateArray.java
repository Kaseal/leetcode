package medium.arrays;

//189. Rotate Array (Medium)
public class RotateArray {

	public void rotate(int[] nums, int k) {
		for (int j = 0; j < k; j++) {
			int buf = nums[nums.length - 1];
			for (int i = nums.length - 1; i >= 0; i--) {
				if (i == 0) {
					nums[i] = buf;
					break;
				}
				nums[i] = nums[i - 1];
			}
		}
	}

	public void _rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int buf = nums[left];
			nums[left] = nums[right];
			nums[right] = buf;
			left++;
			right--;
		}
	}

}
