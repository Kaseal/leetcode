package easy;

//27. Remove Element (Easy)
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		if (nums.length == 1 && nums[0] == val) {
			return 0;
		}

		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[len] = nums[i];
				len++;
			}
		}

		return len;
	}

}
