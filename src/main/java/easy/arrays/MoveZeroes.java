package easy.arrays;

//283. Move Zeroes (Easy)
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int left = 0;
		int zeroCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCount++;
			} else {
				nums[left++] = nums[i];
			}
		}
		while (zeroCount-- > 0) {
			nums[left++] = 0;
		}
	}

}
